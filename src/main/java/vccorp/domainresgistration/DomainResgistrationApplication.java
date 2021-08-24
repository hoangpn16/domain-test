package vccorp.domainresgistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DomainResgistrationApplication {
	public static void main(String[] args) {
		SpringApplication.run(DomainResgistrationApplication.class, args);
		System.out.println("Application is starting");
	}

}
