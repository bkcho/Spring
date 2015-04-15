package di.lifeCycle;

import org.springframework.context.support.GenericXmlApplicationContext;

import di.student.Student;

public class MainClass {

	public static void main(String[] args) {
		
		// 생성
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		// 설정
		ctx.load("classpath:applicationCTX.xml");
		ctx.refresh();
		
		// 사용
		Student student = ctx.getBean("student1", Student.class);
		System.out.println("이름: " + student.getName());
		System.out.println("나이: " + student.getAge());
		
		// 소멸
		ctx.close();		
	}
}
