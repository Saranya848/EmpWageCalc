package com.employeewages;
import java.util.*;
public class EmployeeWages {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int isfulltime = sc.nextInt();
		System.out.println("Welcome to Employee Wages");
		double empCheck=Math.floor(Math.random()*10) % 2;
		
		if(empCheck!=isfulltime)
		{
			System.out.println("Employee is Present");
		}
		else
			System.out.println("Employee is Absent");
	    sc.close();
	}

}
