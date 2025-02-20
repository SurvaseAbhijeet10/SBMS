package com.sbms;

public class Test {

	public static void main(String[] args) {
		RestaruntService RS = new RestaruntService();
		RS.Payment = new DebitCardPayment();
		RS.collectBill(1263.7);
	}
}
