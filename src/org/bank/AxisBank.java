package org.bank;

public class AxisBank extends BankInfo implements Interface, Inter,Iner1 {

	@Override
	public void canara() {
		System.out.println("canara bank");
	}

	@Override
	public void axis() {
		System.out.println("axis bank");
	}

	@Override
	public void sbi() {
		System.out.println("sbi bank");
	}

	@Override
	public void renjith() {
		System.out.println("renjith");
	}

	@Override
	public void ronaldo() {
		System.out.println("ronaldo");
	}

	@Override
	public void bank() {
		System.out.println("banking");
	}

	@Override
	public void details() {
		System.out.println("detailing");
	}
	

	@Override
	public void messi() {
		System.out.println("im messi");
	}

	@Override
	public void mithin() {
System.out.println("im mithin");		
	}
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.canara();
		a.axis();
		a.sbi();
		a.renjith();
		a.ronaldo();
		a.details();
		a.bank();
		a.messi();
		a.mithin();
		a.china();
	}

	@Override
	public void china() {
System.out.println("china");		
	}
}