package com.example;

import com.example.dao.entities.User;
import com.example.dao.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner start(UserRepository userRepository) {
		return args -> {
			List<User> users = List.of(
					User.builder().name("user1").email("user1@gmail.com").date_Naissance(new Date()).password("").build(),
					User.builder().name("user2").email("user2@gmail.com").date_Naissance(new Date()).password("").build(),
					User.builder().name("user3").email("user3@gmail.com").date_Naissance(new Date()).password("").build(),
					User.builder().name("user4").email("user4@gmail.com").date_Naissance(new Date()).password("").build()
			);
			userRepository.saveAll(users);
		};
	}
}
