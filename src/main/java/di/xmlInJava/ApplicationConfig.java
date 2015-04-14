package di.xmlInJava;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import di.student.Student;

@Configuration
@ImportResource("classpath:applicationCTX.xml")
public class ApplicationConfig {
	
	@Bean
	public Student student4(){
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("컴퓨터");
		hobbys.add("강아지");
		
		Student student = new Student("유성필", 35, hobbys);
		student.setHeight(177);
		student.setWeight(72);
		
		return student;		
	}	
}
