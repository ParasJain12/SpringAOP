package com.aop.service;

public class PaymentServiceImpl implements PaymentService {

//	public void makePayment() {
//		//Payment Code
//		System.out.println("Amount Debited");
//		System.out.println("Amount Credited");	
//	}
	
	public void makePayment(int amount) {
		//Payment Code
		System.out.println("Amount Debited: "+amount);
		System.out.println("Amount Credited: "+amount);	
	}
	
	
}
