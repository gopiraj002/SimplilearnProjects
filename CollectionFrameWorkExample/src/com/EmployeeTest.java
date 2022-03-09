package com;
import bean.Employee;
public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Ravi");
		emp.setSalary(12000);
		System.out.println("Id is "+emp.getId());
		System.out.println("name is "+emp.getName());
		System.out.println("salary is "+emp.getSalary());
		Employee emp1 = new Employee(101, "Ramesh",1400);
		System.out.println("Id is "+emp1.getId());
		System.out.println("name is "+emp1.getName());
		System.out.println("salary is "+emp1.getSalary());

	}

}
