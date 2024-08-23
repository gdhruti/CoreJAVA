package com.evergent.corejava.javabeans;

//initializing and retriving using setter and getter respectively
public class EmployeeImpl {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEno(100);
		emp.setEname("Dhruti");
		emp.setSal(500.00);
		System.out.println("Employee no "+emp.getEno());
		System.out.println("Employee name "+emp.getEname());
		System.out.println("Employee sal "+emp.getSal());
	}
}