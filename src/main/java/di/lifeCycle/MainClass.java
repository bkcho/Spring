package di.lifeCycle;

import org.springframework.context.support.GenericXmlApplicationContext;

import di.student.Student;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		ctx.load("classpath:applicationCTX.xml");
		ctx.refresh();
		
		Student student = ctx.getBean("student1", Student.class);
		System.out.println("이름: " + student.getName());
		System.out.println("나이: " + student.getAge());
		
		ctx.close();		
	}
}
