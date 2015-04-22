package aop.exam2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import aop.exam2.Student;
import aop.exam2.Worker;

public class MainClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX_aop2.xml");
		
		Student student = ctx.getBean("student", Student.class);
		student.getStudentInfo();
		
		Worker worker = ctx.getBean("worker",Worker.class);
		worker.getWorkerInfo();
		
		ctx.close();
	}
}
