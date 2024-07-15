package com.sj.empmanagmentapplication;

public class Employee { /*
						 * id: Represents the unique identifier for an employee.
						 * name: Represents the name of the employee.
						 * age: Represents the age of the employee.
						 * designation: Represents the job designation or role of the employee.
						 * department: Represents the department in which the employee works.
						 * salary: Represents the salary of the employee.
						 */

	private int id;
	private String name;
	private int age;
	private String desiganation;
	private String department;
	private double salary;
	// Parameterized constructor to initialize the Employee object with specific
	// values.

	// Getter methods retrieve the values of the respective fields.
	// Setter methods set the values of the respective fields.
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesiganation() {
		return desiganation;
	}

	public void setDesiganation(String desiganation) {
		this.desiganation = desiganation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override // Overrides the toString method to provide a string representation of the
				// Employee object, displaying all the field values.
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", desiganation=" + desiganation
				+ ", department=" + department + ", salary=" + salary + "]";
	}

	public Employee(int id, String name, int age, String desiganation, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.desiganation = desiganation;
		this.department = department;
		this.salary = salary;
	}

}
