package com.sbms;

public class RestaruntService {

	IPayment Payment;
	
	public void collectBill(double atm) {
		boolean Status = Payment.payBill(atm);
		
		if(Status) {
			System.out.println("payment is sucessfull...Thank you");
		}
		else{
			System.err.println("Card Declined");
		}
	}
}
