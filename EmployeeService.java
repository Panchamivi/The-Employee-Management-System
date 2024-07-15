package com.sj.empmanagmentapplication;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeService {

	HashSet<Employee> empset = new HashSet<Employee>(); // empset: A HashSet to store Employee objects.
	// Initial Employee objects added to the empset for demonstration purposes.
	Employee emp1 = new Employee(101, "Shital", 24, "Developer", "IT", 25000);
	Employee emp2 = new Employee(102, "Meena", 26, "Tester", "CO", 57000);
	Employee emp3 = new Employee(103, "Bob", 20, "DevOps Eng", "Admin", 5000);
	Employee emp4 = new Employee(104, "Max", 27, "System Eng", "CO", 70000);
	// sc: Scanner object for user input.
	Scanner sc = new Scanner(System.in);

	// Variables used for various operations such as searching, updating, and adding
	// employees.
	boolean found = false;
	int id;
	String name;
	int age;
	String department;
	String desiganation;
	double sal;

	// Constructor initializes the empset HashSet with initial Employee objects.
	public EmployeeService() {

		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);

	}

	public void viewAllEmps() { // Displays details of all employees in the empset.
		for (Employee emp : empset) {
			System.out.println(emp);
		}
	}

	public void viewEmp() { // Displays details of a specific employee based on the entered ID.

		System.out.println("Enter id: ");
		id = sc.nextInt();
		for (Employee emp : empset) {
			if (emp.getId() == id) {
				System.out.println(emp);
				found = true;
			}

		}
		if (!found) {
			System.out.println("Employee with this id is not present");
		}
	}

	// update the employee
	public void updateEmployee() {
		System.out.println("Enter id: ");
		id = sc.nextInt();
		boolean found = false;
		for (Employee emp : empset) {
			if (emp.getId() == id) {
				System.out.println("Enter name: ");
				name = sc.next();
				System.out.println("Enter new Salary");
				sal = sc.nextDouble();
				emp.setName(name);
				emp.setSalary(sal);
				System.out.println("Updated Details of employee are: ");
				System.out.println(emp);
				found = true;
			}
		}
		if (!found) {
			System.out.println("Employee is not present");
		} else {
			System.out.println("Employee details updated successfully !!");
		}
	}

	// delete emp
	public void deleteEmp() {
		System.out.println("Enter id");
		id = sc.nextInt();
		boolean found = false;
		Employee empdelete = null;
		for (Employee emp : empset) {
			if (emp.getId() == id) {
				empdelete = emp;
				found = true;
			}
		}
		if (!found) {
			System.out.println("Employee is not present");
		} else {
			empset.remove(empdelete);
			System.out.println("Employee deleted successfully!!");
		}
	}

	// add emp
	public void addEmp() {
		System.out.println("Enter id:");
		id = sc.nextInt();
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("Enter age");
		age = sc.nextInt();
		System.out.println("enter Desiganation");
		desiganation = sc.next();
		System.out.println("Enter Department");
		department = sc.next();
		System.out.println("Enter sal");
		sc.nextDouble();

		Employee emp = new Employee(id, name, age, desiganation, department, sal);

		empset.add(emp);
		System.out.println(emp);
		System.out.println("Employtee addeed successsfully");

	}

}
