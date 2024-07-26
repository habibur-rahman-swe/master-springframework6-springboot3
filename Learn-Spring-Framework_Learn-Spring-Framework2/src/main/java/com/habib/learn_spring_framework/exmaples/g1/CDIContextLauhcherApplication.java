package com.habib.learn_spring_framework.exmaples.g1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
class BusinessService {
	private DataService dataservice;

	public DataService getDataservice() {
		return dataservice;
	}

	@Inject
	public void setDataservice(DataService dataservice) {
		System.out.println("Setter Injection");
		this.dataservice = dataservice;
	}
}

@Named
class DataService {

}

@Configuration
@ComponentScan
public class CDIContextLauhcherApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(CDIContextLauhcherApplication.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(BusinessService.class).getDataservice());
		}

	}
}
