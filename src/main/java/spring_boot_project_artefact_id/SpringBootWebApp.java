package spring_boot_project_artefact_id;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootWebApp {

	@RequestMapping("/")
	String home() {
		return "Hello World - Spring boot project 1.1!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApp.class, args);
	}
	
	

}