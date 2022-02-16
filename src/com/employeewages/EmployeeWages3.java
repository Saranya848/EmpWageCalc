package com.employeewages;
import java.util.*;
public class EmployeeWages3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int ishalftime = 0, isfulltime = 1;
		final int emprateperhour=20;		
		final int halfdayhour=8;		
		int salary=0, empHours = 0;
		Math.floor(Math.random()*10);
		salary= emprateperhour * halfdayhour;
		System.out.println("Welcome to Employee Wages");
		double empCheck=Math.floor(Math.random()*10) % 2;
		if(empCheck==isfulltime) {
			System.out.println("Employee is fulltime");
			empHours=16;
		}
		else if(empCheck==ishalftime)
		{
			System.out.println("Employee is Parttime");
			empHours=8;
		}
			salary=empHours * emprateperhour;
			
			System.out.println("Employee salary is  "+salary);
	    sc.close();
	}

}
