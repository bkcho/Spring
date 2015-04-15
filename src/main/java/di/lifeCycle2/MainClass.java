package di.lifeCycle2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		ctx.load("classpath:applicationCTX_lifeCycle.xml");
		ctx.refresh();
		
		ctx.close();
	}
}
