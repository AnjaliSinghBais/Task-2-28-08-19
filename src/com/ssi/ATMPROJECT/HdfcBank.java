package com.ssi.ATMPROJECT;

public class HdfcBank implements ATM {

	@Override
	public void balanceEnquiry() {
		System.out.println("HDFC BANK YOUR BALANCE:3400000....");
		
	}

	@Override
	public void changePin() {
		System.out.println("HDFC BANK YOUR PIN CHANGED SUCESSFULLY....");
		
	}


	@Override
	public void withdraw() {
		System.out.println("HDFC BANK KINDLY COLLECT THE CASH.....");
		
	}

}
