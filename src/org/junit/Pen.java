package org.junit;

public class Pen {

	private int privField;
	
	public int pubField;
	
	public Pen() {
		this.privField = 9;
		this.pubField = 5;
	}
	
	private String privFunc(String s) {
		return s.toLowerCase();
	}
	
	
	public void printPrivateThing() {
		System.out.println(privField);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
