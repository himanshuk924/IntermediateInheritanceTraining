package com.training.employee;

public class TrainingCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CONSTRUCTOR HAVING AGUMENTS AS SUBJECT,FEES,PARTICIPANTS
		Training publictraining=new PublicTraining("Java",5000, 50);
		System.out.println("Cost of Public training with Id "+Training.getId()+" is: "+publictraining.getOrderValue());
		//CONSTRUCTOR HAVING AGUMENTS AS SUBJECT,FEES,DAYS
		Training corporatetraining=new PublicTraining("BigDAta",35000, 4);
		System.out.println("Cost of Corporate training with Id "+Training.getId()+" is: "+corporatetraining.getOrderValue());
	}

}
