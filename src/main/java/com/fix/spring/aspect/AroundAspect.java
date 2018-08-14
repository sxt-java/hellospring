package com.fix.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 环绕通知
 * @author Administrator
 *
 */
public class AroundAspect {

	public boolean test(ProceedingJoinPoint jp){
		Boolean ok=false;
		
		System.out.println("=====模仿前置通知=====");
		try {
			//获取目标方法的参数
			Object[] args= jp.getArgs();	
			System.out.println("目标参数是"+args[0]);
			
			jp.proceed(args);//执行目标方法	
			//System.out.println("目标方法返回值是"+re);
			ok=true;
		
			System.out.println("=====模仿后置通知=====");
			
		} catch (Throwable e) {
			//e.printStackTrace();
			System.out.println("=====模仿异常通知====="+e.getMessage());
		}
		
		return ok;		
	}
	
}
