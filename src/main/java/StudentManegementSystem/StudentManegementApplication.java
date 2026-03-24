package StudentManegementSystem;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentManegementApplication {

  private Map<String, Integer> studentMap = new HashMap<>();

  public static void main(String[] args) {
    SpringApplication.run(StudentManegementApplication.class, args);
  }

  @PostMapping("/addStudent") //生徒情報の追加
  public String addStudent(String name, int age) {
    studentMap.put(name, age);
    return "追加しました";
  }

  @GetMapping("/students")
  public Map<String,Integer> getStudents(){
    return studentMap;
  }

  @PostMapping("/updateStudent") //生徒情報の更新
  public String updateStudent(String name, int age) {
    studentMap.put(name, age);
    return "更新しました";
  }

  // GET POST
  // GETは取得する、リクエストの結果を受け取る
  // POSTは情報を与える、渡す
}