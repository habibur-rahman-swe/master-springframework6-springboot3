package com.hr.rest.webservices.user.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.hr.rest.webservices.entity.User;

@Component
public class UserModelService {

	private static List<User> users = new ArrayList<>();
	private static Long usersCount = 0l;
	
	static {
		users.add(new User(1l, "A", LocalDate.now().minusYears(++usersCount)));
		users.add(new User(2l, "B", LocalDate.now().minusYears(++usersCount)));
		users.add(new User(3l, "C", LocalDate.now().minusYears(++usersCount)));
		users.add(new User(4l, "D", LocalDate.now().minusYears(++usersCount)));
		users.add(new User(5l, "E", LocalDate.now().minusYears(++usersCount)));
		users.add(new User(6l, "F", LocalDate.now().minusYears(++usersCount)));
	}
	
	public User save(User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
	}
	
	public List<User> findAll() {
		return users;
	}

	public User findById(Long id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().get();
	}

	public User deleteById(Long id) {
		Predicate<? super User> predicate1 = user -> user.getId().equals(id);
		Predicate<? super User> predicate2 = user -> user.getId() != id;
		
		User user = users.stream().filter(predicate1).findFirst().get();
		users = users.stream().filter(predicate2).collect(Collectors.toList());
		return user;
	}
	
}
