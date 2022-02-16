package com.employeewages;
import java.util.*;
public class EmployeeWages3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int ishalftime = sc.nextInt();
		final int emprateperhour=20;		
		final int halfdayhour=8;		
		int salary=0;
		Math.floor(Math.random()*10);
		salary= emprateperhour * halfdayhour;
		System.out.println("Welcome to Employee Wages");
		double empCheck=Math.floor(Math.random()*10) % 2;
		if(empCheck!=ishalftime)
		{
			System.out.println("Employee is Present");	
		System.out.println("Employee salary is "+salary);
		}
		else{
			System.out.println("Employee is Absent");
		}
	    sc.close();
	}

}
