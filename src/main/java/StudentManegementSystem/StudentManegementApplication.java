package StudentManegementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentManegementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManegementApplication.class, args);
	}

	@GetMapping("/spring")
	public String spring() {
		return "Javaエンジニアスタンダード 第2回演習課題";
	}
}
