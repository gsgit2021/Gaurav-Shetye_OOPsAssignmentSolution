package com.greatlearning.assgn1;

public class Main {
	public static void main (String[] args) {
		
		HRDepartment HR = new HRDepartment();
		TechDepartment TECH = new TechDepartment();
		AdminDepartment ADMIN = new AdminDepartment();
		
		ADMIN.departmentName();
		ADMIN.getTodaysWork();
		ADMIN.getWorkDeadline();
		ADMIN.isTodayAHoliday();
		System.out.println();
		HR.departmentName();
		HR.doActivity();
		HR.getTodaysWork();
		HR.getWorkDeadline();
		HR.isTodayAHoliday();
		System.out.println();
		TECH.departmentName();
		TECH.getTodaysWork();
		TECH.getWorkDeadline();
		TECH.getTechStackInformation();
		TECH.isTodayAHoliday();		
		
	}

}
