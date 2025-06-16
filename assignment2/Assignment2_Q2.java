package assignment2;

import java.util.Arrays;
import java.util.Scanner;

class Employee{
	private int EmpId;
	private String name;
	
	public Employee(int empId, String name) {
		super();
		EmpId = empId;
		this.name = name;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return String.format("%-10d%10s", this.getEmpId(), this.getName());
	}
	
}
public class Assignment2_Q2 {

	public static void main(String[] args) {
		Employee [] emp = new Employee[] {
				new Employee(1, "Sham"),
				new Employee(2, "Ram"),
				new Employee(3, "Raju"),
				new Employee(4, "Rajesh")
		};
		
		System.out.println(Arrays.toString(emp));
		System.out.println("Enter the name to find: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		for(Employee m : emp) {
			if(m.getName().toLowerCase().compareTo(name.toLowerCase()) == 0) {
				System.out.println(m.toString());
			}
		}
	}

}
