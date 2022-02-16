package com.employeewages;
public class EmployeeWages4 {
		public static void main(String[] args) {
			//constants
			final int isparttime=1;
			final int isfulltime=2;
			//variables
			int rateperHour=20;
			int empHours = 0;
			int salary=0;

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
			System.out.println("Employee Salary is "+salary);
		}

}
