package com.experiment.examination;

import com.experiment.examination.dao.UserDao;

import com.experiment.examination.entity.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class ExaminationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExaminationApplication.class, args);
	}

	@Bean
	CommandLineRunner cmdLineRunner(UserDao userDao) {
		return args -> {
			userDao.saveAll(
					Arrays.asList(
							new Person("Person A"),
							new Person("Person B"),
							new Person("Person C")
					)
			);
		};
	}
}
