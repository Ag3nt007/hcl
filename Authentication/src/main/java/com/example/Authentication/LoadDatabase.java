package com.example.Authentication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.Authentication.entities.User;
import com.example.Authentication.repositories.UserRepository;

@Configuration
public class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(UserRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new User("test", "test@gmail.com", "test")));
      log.info("Preloading " + repository.save(new User("abc", "abc@gmail.com", "abc")));
      log.info("Preloading " + repository.save(new User("xyz", "xyz@gmail.com", "xyz")));
      log.info("Preloading " + repository.save(new User("check", "check@gmail.com", "check")));
      log.info("Preloading " + repository.save(new User("john", "john@gmail.com", "1234")));
    };
  }
}
