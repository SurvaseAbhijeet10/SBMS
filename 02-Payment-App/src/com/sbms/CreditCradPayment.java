package com.sbms;

public class CreditCradPayment implements IPayment {

	@Override
	public boolean payBill(double atm) {
		System.out.println("Creditcard Processing...");
		//Logic
		return true;
	}

}
