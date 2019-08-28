package com.ssi.ATMPROJECT;

public class SBIBank implements ATM {

	@Override
	public void balanceEnquiry() {
		System.out.println("SBI BANK YOUR BALANCE:90000....");
		
	}

	@Override
	public void changePin() {
		System.out.println("SBI BANK YOUR PIN CHANGED SUCESSFULLY....");
		
	}


	@Override
	public void withdraw() {
		System.out.println("SBI BANK KINDLY COLLECT THE CASH.....");
		
	}

}
