package com.fix.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 警察 对所有注册用户检查 
 * @author Administrator
 *
 */
@Component
@Aspect
public class PoliceAspect {
	
	@Pointcut("execution(* com.fix.spring.mvctest.service.*.*(..))")
	public void add(){}
	
	@Before("add()")
	public void check(JoinPoint jp){
		System.out.println("==============检查是否有违法行为 ===========");
		System.out.println("类名：" + jp.getTarget().getClass().getName());
        System.out.println("方法名：" + jp.getSignature().getName());
        System.out.println("开始添加学生：" + jp.getArgs()[0]);
        System.out.println("======================================");		
	}
	
	public void show(JoinPoint jp){
		System.out.println("注册完，就去领书");
		
	}
	
	//有异常进入此方法
	public void hasException(Exception ex){
		System.out.println("发生了异常"+ex.getMessage());
	}
	 
}
