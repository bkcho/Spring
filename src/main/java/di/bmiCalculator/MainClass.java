package di.bmiCalculator;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);
		myInfo.getInfo();
		 
		// 다른 객체 사용 
		MyInfo myInfo2 = ctx.getBean("myInfo2", MyInfo.class);
		myInfo2.getInfo();
				
		ctx.close();		
	}
}
