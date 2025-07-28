package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.PaymentService;

public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    		ApplicationContext context = new ClassPathXmlApplicationContext("com/aop/config.xml");
    		PaymentService paymentObject = context.getBean("Payment",PaymentService.class);
    		//paymentObject.makePayment();
    		paymentObject.makePayment(1000);
    }
}
