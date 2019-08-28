package com.ssi.ATMPROJECT;

public class ATMMachine {

	ATM atm;
	public void set(ATM atm) {
		this.atm = atm;

	}
	public void checkBalanceEnquiry()
	{
		if(atm!=null){
			atm.balanceEnquiry();;
		  }
		else{
			System.out.println("INSERT CARD PROPERLY");
		}
	}
	
	public void doWithdraw()
	{
		if(atm!=null){
			atm.withdraw();
		  }
		else{
			System.out.println("INSERT CARD PROPERLY");
		}
	}
	
	public void doChangePin()
	{
		if(atm!=null){
			atm.changePin();
		  }
		else{
			System.out.println("INSERT CARD PROPERLY");
		}
	}
	
	
	public static void main (String args[]){
	ATMMachine atmmachine=new ATMMachine();	
	atmmachine.set(new AxisBank());
	atmmachine.checkBalanceEnquiry();
	atmmachine.doChangePin();
	atmmachine.doWithdraw();
    System.out.println("--------------------------------");
    
	atmmachine.set(new SBIBank());
	atmmachine.checkBalanceEnquiry();
	atmmachine.doChangePin();
	atmmachine.doWithdraw();
	System.out.println("--------------------------------");
	
	atmmachine.set(new HdfcBank());
	atmmachine.checkBalanceEnquiry();
	atmmachine.doChangePin();
	atmmachine.doWithdraw();
	System.out.println("--------------------------------");
	
	}
	
	
}
