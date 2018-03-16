package ro.jmind.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"ro.jmind.controller", "ro.jmind.app" })
@SpringBootApplication
@EntityScan(basePackages = "ro.jmind.model")
@EnableJpaRepositories({"ro.jmind.repo"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
