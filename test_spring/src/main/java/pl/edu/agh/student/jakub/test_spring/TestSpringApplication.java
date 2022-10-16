package pl.edu.agh.student.jakub.test_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.agh.student.jakub.test_spring.student.Student;

import java.util.List;

@SpringBootApplication
@RestController
public class TestSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringApplication.class, args);
	}
	@GetMapping
	public List<Student> hello(){
		return List.of(new Student());
	}

}
