package com.sbms;

public class DebitCardPayment implements IPayment {

	@Override
	public boolean payBill(double atm) {
		
		System.out.println("debit card payment processing");
		return true;
	}

}
