package org.nblott;

public class Data {

	private int privField;
	
	public int pubField;
	
	public Data() {
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
