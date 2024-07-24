package org.bank;

public class AxisBank  extends BankInfo {
	
	
	public void deposit() {
		// TODO Auto-generated method stub
		super.deposit();
		System.out.println("overided deposit method");
		

	}
	
	
public static void main(String[] args) {
		
		
	AxisBank b = new AxisBank ();
		b.deposit();
		b.saving();
		b.fixed();;
		
		}
}
