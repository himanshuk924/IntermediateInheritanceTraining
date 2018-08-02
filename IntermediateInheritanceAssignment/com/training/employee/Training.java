package com.training.employee;

public abstract class Training {
	private static int id = 0;
	private String subject;
	private int fees;
	// constructor to set subject fees and id
	public Training(String subject, int fees) {
		this.subject = subject;
		this.fees = fees;
		id++;
	}

	public static int getId() {
		return id;
	}

	public int getFees() {
		return fees;
	}
	// abstract method definition is different for different class
	abstract int getOrderValue();
}
