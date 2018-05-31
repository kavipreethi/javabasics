package com.basic;

public class Employee 
{
	String name;
	double salary;
 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
  
    public static void main(String[]args)
    {
	Employee Employee1 = new Employee();
	Employee1.setName("name");
	Employee1.setSalary(100);
	Employee Employee2 = new Employee();
	Employee2.setName("name");
	Employee2.setSalary(100);
	double Salary = Employee1.getSalary();
	Salary= Salary*1.1;
	Employee1.setSalary(Salary);
	System.out.println(Salary);
    }
}
	
	
	
	
	
	
	
	

