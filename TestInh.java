class Person{
	String name;
	String mobile;
	
	void setPersonDetails(String n,String m){
		name=n;
		mobile=m;
	}
	void displayPersonDetails(){
		System.out.println("Name"+name);
		System.out.println("Mobile"+mobile);
	}
}
class Employee extends Person{
	String employeeId;
	String designation;
	String department;
	
	void setEmployeeDetails(String eid,String dept,String desig)
	{
		employeeId=eid;
		designation=desig;
		department=dept;
	}
	void displayEmployeeDetails()
	{
		System.out.println("Employee Id"+employeeId);
		System.out.println("Designation"+designation);
		System.out.println("Department"+department);
	}
}	
class TestIt{
	public static void main(String ar[]){
		Employee emp=new Employee();
		emp.setPersonDetails("Ramesh","9940801145");
		emp.setEmployeeDetails("Emp001","sales","Manager");
		emp.displayEmployeeDetails();
	}
}