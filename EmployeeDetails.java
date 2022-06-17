package week.day1;

public class EmployeeDetails {
	public static void main(String[] agrs)
	{

	EmployeeDetails obj = new EmployeeDetails();
	obj.printEmployeeName("ANUSHA", 3419);	
	obj.getEmployeeAddress("Thiruvarur");
	obj.printEmployeeSalary(158679.8643);
	obj.printEmployeeMobileNumber(907856789);

}
 public void printEmployeeName(String empName,int empId)
{
	System.out.println("EmpName:"+empName);
	System.out.println("EmpId:"+empId);
}

 public void getEmployeeAddress(String empAddress) 
 {
	System.out.println("EmployeeAddress:"+empAddress);
}
 public void printEmployeeSalary(double empSalary)
 {
	 System.out.println("EmpSalary:"+empSalary);
 }
 public void printEmployeeMobileNumber(long mobNum)
 {
	 System.out.println("Mobile Number:"+mobNum);
 }
 }

