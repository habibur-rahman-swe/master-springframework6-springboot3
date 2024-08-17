package com.habib.todo_app.security;

import static org.springframework.security.config.Customizer.withDefaults;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {

	@Bean
	InMemoryUserDetailsManager createUserDetailsManager() {

		UserDetails userDetails1 = createNewUser("in28minutes", "password");
		UserDetails userDetails2 = createNewUser("user", "password");

		return new InMemoryUserDetailsManager(userDetails1, userDetails2);
	}

	private UserDetails createNewUser(String username, String password) {
		Function<String, String> passwordEncoder = input -> passwordEncoder().encode(input);

		UserDetails userDetails = User.builder().passwordEncoder(passwordEncoder).username(username).password(password)
				.roles("USER", "ADMIN").build();
		return userDetails;
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());
		httpSecurity.formLogin(withDefaults());

        httpSecurity.csrf(csrf -> csrf.disable());
        httpSecurity.headers(headers -> headers.frameOptions().disable());
		
		return httpSecurity.build();
	}

}
