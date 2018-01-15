package springBootCICD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import controllers.MainController;

@SpringBootApplication
@ComponentScan(basePackageClasses = MainController.class)
public class SpringBootCicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCicdApplication.class, args);
	}
}
