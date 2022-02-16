package com.employeewages;

public class EmployeeWages6 {
	public static void main(String[] args) {
		//constants
		final int isparttime=1;
		final int isfulltime=2;
		//variables
		int rateperHour=20;
		int empHours = 0, salary=0, mSalary=0;
		int workingdays=20;
		int temphours=0, tworkingdays=0;
		int month=100;

		while(temphours <= month && tworkingdays <= workingdays ) {
			tworkingdays++;
		    double empCheck=Math.floor(Math.random()*10) % 3;
		    int empcheck=(int)empCheck;
		
		    switch(empcheck){    
		    case isfulltime:    
		    	empHours=8;
		    	break;  //optional  
		    case isparttime:    
		    	empHours=4;
		    	break; 
		    default:     
		    	empHours=0;  
		    	break;
		    }

		salary=rateperHour*empHours;
		mSalary=mSalary+salary;
		temphours+=mSalary;
		}
		System.out.println("Employee monthly Salary is "+mSalary);
		System.out.println("Employee Total Salary is "+temphours);
	}
}