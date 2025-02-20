package com.sbms.beans;

public class DebitCardPayment implements IPayment {

	@Override
	public boolean payBill(double atm) {
		System.out.println("DebitCardPayment Procesasing...");
		return true;
	}

}
