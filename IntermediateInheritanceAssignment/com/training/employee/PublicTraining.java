package com.training.employee;

public class PublicTraining extends Training{
	private int participants;
	
	public PublicTraining(String subject,int fees,int participants) {
		super(subject,fees);//TO INVOKE PARENT FUNCTION
		this.participants=participants;
	}
	
	public int getOrderValue() {//ABSTRACT METHOD IN PARENT CLASS
		return getFees()*participants;
	}
}
