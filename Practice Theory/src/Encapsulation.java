

public class Encapsulation {
private int empid;
private String empName;
private String deptName;
private double salary;

public void setEmpid(int id) {
	empid= id;	
}
public void setEmpName(String name) {
	empName= name ;
}
public void setDeptName(String dept) {
	deptName= dept ;
}
public void setSalary(double sal) {
	if (sal<1000) {
		throw new RuntimeException("salary can not be less than 1000");
	}
	salary= sal;
}
	
	void displayDetails() {
		System.out.println("Employee id |" +" "+"Employee name |"+" "+"Department name |"+" "+"Salary");
		System.out.println("------------|---------------|-----------------|-------------");
		System.out.printf(empid +"         |     "+empName+"    |   "+deptName+"         |"+salary);
		
	
}
}