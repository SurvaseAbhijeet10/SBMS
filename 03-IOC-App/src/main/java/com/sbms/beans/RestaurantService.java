package com.sbms.beans;

public class RestaurantService {

	private IPayment payment;
	
	public RestaurantService() {
		System.out.println("Restauratnt service constructor...");
	}
	
	public void processPayment(double amt) {
		boolean status = payment.payBill(amt); 
		
		if(status) {
			System.out.println("payment is sucessfull..");
		}else {
			System.err.println("Payment Failed...");
		}
	}
}
