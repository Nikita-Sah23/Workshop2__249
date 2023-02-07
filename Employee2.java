package com.bridgelabz;

public class Employee2 {

	public static void main(String[] args) {
		
		EmployeeManagmentSystem emsObj =new EmployeeManagmentSystem();
		Employee empObj = new Employee("Nikita", "Sah", "758968222", 10,"ghdy@shgs.com");
		Employee empObj2 = new Employee("Shreya", "pathak", "907506890", 11,"Shreya@shgs.com");
		Employee empObj3 = new Employee("Ray", "louis", "705080120", 12,"lweaxvz@shgs.com");
		
		emsObj.addEmp(empObj);				
		emsObj.addEmp(empObj2);
		emsObj.addEmp(empObj3);
		emsObj.printEmployees();
				
	}	
}
