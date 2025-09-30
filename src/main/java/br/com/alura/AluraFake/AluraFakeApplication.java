package br.com.alura.AluraFake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.alura.AluraFake.services", "br.com.alura.AluraFake.repositories", "br.com.alura.AluraFake.controllers"})
@EnableJpaRepositories(basePackages = "br.com.alura.AluraFake.repositories")
@EnableAutoConfiguration
public class AluraFakeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AluraFakeApplication.class, args);
	}

}
