package com.aop.aspect;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;

@Aspect
public class MyPaymentAspect {

//	@Before("execution(* com.aop.service.PaymentServiceImpl.makePayment())")
//	public void printBefore() {
//		System.out.println("Payment started...");
//	}
//	
//	@After("execution(* com.aop.service.PaymentServiceImpl.makePayment())")
//	public void printAfter() {
//		System.out.println("Payment Done...");
//	}
	
	@Before("execution(* com.aop.service.PaymentServiceImpl.makePayment(..))")
	public void printBefore() {
		System.out.println("Payment started...");
	}
	
	@After("execution(* com.aop.service.PaymentServiceImpl.makePayment(..))")
	public void printAfter() {
		System.out.println("Payment Done...");
	}
}


