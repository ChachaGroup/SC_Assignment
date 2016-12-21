package pack;

public class Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variables varExample = new Variables();
		varExample.EmployeeName="Atiq ur Rehman";
		varExample.EmployeeType="Permanent";
		varExample.EmployeeBasicSalary=50000;
		varExample.Employeebonus=20000;
		
		if(varExample.EmployeeBasicSalary>=30000)
			System.out.println("20% bonus");
		else
			System.out.println("10% bonus");
		
	}

}
