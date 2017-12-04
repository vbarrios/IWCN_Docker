package com.iwcn.master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.iwcn.master.configuration.UserDatabase;


@SpringBootApplication
@EnableJpaRepositories()
public class SpringClientRest {
	
	@Bean
	public UserDatabase user () {
		return new UserDatabase();
	}
	
    public static void main(String[] args) {
        SpringApplication.run(SpringClientRest.class, args);
    }

}
