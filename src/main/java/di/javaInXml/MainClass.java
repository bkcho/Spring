package di.javaInXml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import di.student.Student;

public class MainClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX_javainxml.xml");
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println("이름: " + student1.getName());
		System.out.println("나이: " + student1.getAge());
		System.out.println("취미: " + student1.getHobbys());
		System.out.println("신장: " + student1.getHeight());
		System.out.println("몸무게: " + student1.getWeight());
		
		Student student3 = ctx.getBean("student3", Student.class);
		System.out.println("이름: " + student3.getName());
		System.out.println("나이: " + student3.getAge());
		System.out.println("취미: " + student3.getHobbys());
		System.out.println("신장: " + student3.getHeight());
		System.out.println("몸무게: " + student3.getWeight());
	}
}
