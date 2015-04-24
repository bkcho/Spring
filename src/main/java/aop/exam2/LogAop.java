package aop.exam2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {
/*	
	@Pointcut("execution(public void get*(..))") // public void인 모든 get메소드
	@Pointcut("execution(* aop.exam2.*.*())") // aop.exam2 패키지에 파라미터가없는 모든 메소드	
	@Pointcut("execution(* aop.exam2..*.*())") // aop.exam2 패키지 & aop.exam2 하위패키지에 파라미터가 없는 모든 메소드	
	@Pointcut("execution(* aop.exam2.Worker.*())") // aop.exam2.Worker 모든 메소드
	
	@Pointcut("within(aop.exam2.*)") // aop.exam2 패키지 안에 있는 모든 메소드
	@Pointcut("within(aop.exam2..*)") // aop.exam2 패키지 및 하위 패키지 안에 있는 모든 메소드			
	@Pointcut("within(aop.exam2.Worker)") // aop.exam2.Worker 모든 메소드				
*/			
	@Pointcut("within(aop.exam2.*)")
	private void pointcutMethod(){ 		
	}
	
	@Around("pointcutMethod()")
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable{
		
		String signatureStr = joinpoint.getSignature().toShortString();
		System.out.println(signatureStr +  " is start.");
		long st = System.currentTimeMillis();
		
		try {
			Object obj = joinpoint.proceed();
			return obj;			
		} finally {
			long et = System.currentTimeMillis();
			System.out.println(signatureStr + " is finished.");
			System.out.println(signatureStr + " 경과시간: " + (et - st));			
		}		
	}
	
	@Before("within(aop.exam2.*)")
	public void beforAdvice(){
		System.out.println("beforAdvice()");
	}

}
