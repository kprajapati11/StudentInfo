package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Course;
import dmacc.beans.Student;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Student student() {
		Student bean = new Student("Tony Bean");
		//bean.setName("Troy Bean");
		//bean.setPhone("111-222-3333");
		//bean.setCourse("Java");
		return bean;
	}
	
	@Bean
	public Course course() {
		Course bean = new Course(175, "Java", "Ms Kelli");
		return bean;
	}
}