package com.bridgelabz;

public class Employee {
	
	public Employee() {}
	
	private String firstName;
	private String LastName;
	private String mobile_num;
	private int emp_id;
	private String email;
	
	public String getFirstName() {    //encap
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getMobile_num() {
		return mobile_num;
	}
	public void setMobile_num(String mobile_num) {
		this.mobile_num = mobile_num;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void sendMail() {
		System.out.println("Hi..");
	}
//constructor   --- 
	public Employee(String firstName, String lastName, String mobile_num, int emp_id, String email) {
		
		this.firstName = firstName;
		LastName = lastName;
		this.mobile_num = mobile_num;
		this.emp_id = emp_id;
		this.email = email;
	}
}
//inheritance

class EmployeeManagmentSystem extends Employee{   // implementation
	
	int EmpCount = 0;  //initally 0 emp - number track
	Employee[] empArray = new Employee[100];    //array initialize 
	
	public void sendMail() {
		System.out.println("Employee added succefully");
	}
	
	public void addEmp(Employee obj) {    //store
		if(EmpCount >= 100)
		 System.out.println("Database full");	
		else {		
			empArray[EmpCount]=obj;     // add
			EmpCount++;
			
			sendMail();
			
		}
  }
	public void removeEmp() {
		System.out.println();
	}
	public void printEmployees() {
		for(int i = 0; i < EmpCount; i++) {
			System.out.println(empArray[i].getFirstName()+ "  "+empArray[i].getLastName()+" "+ empArray[i].getMobile_num()+ "  " + empArray[i].getEmp_id()+ " "+ empArray[i].getEmail());
		}
	}
}