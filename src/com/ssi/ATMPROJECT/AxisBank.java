package com.ssi.ATMPROJECT;

public class AxisBank implements ATM {

	@Override
	public void balanceEnquiry() {
		System.out.println("AXIS BANK YOUR BALANCE:5000000....");
		
	}

	@Override
	public void changePin() {
		
		System.out.println("AXIS BANK YOUR PIN CHANGED SUCESSFULLY....");
	}


	@Override
	public void withdraw() {
		System.out.println("AXIS BANK KINDLY COLLECT THE CASH.....");
		
	}

}
