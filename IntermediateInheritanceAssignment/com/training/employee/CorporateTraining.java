package com.training.employee;

public class CorporateTraining extends Training {
	private int days;

	public CorporateTraining(String subject, int fees, int days) {
		super(subject, fees);//TO INVOKE PARENT FUNCTION
		this.days = days;
	}

	int getOrderValue() {//ABSTRACT METHOD IN PARENT CLASS
		return getFees() * days;
	}
}
