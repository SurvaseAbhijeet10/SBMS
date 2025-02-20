package com.sbms.beans;

public class CreditCardPament implements IPayment {

	@Override
	public boolean payBill(double atm) {
		System.out.println("CreditCardPayment Processing...");
		return true;
	}

}
