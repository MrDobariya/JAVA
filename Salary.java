//net salary = gross salary - deduction
//gross salary =  basic + medical + hra + da
//da = 15% of basic
//hra = 10 % of basic
//medical = 4% of basic
//pf = 5% of basic
//insurance = 7% of gross

class Employee
{
	String empName;
	String design;
	int basic;
	
	Employee(String ename,String d, int b)
	{
		empName = ename;
		design = d;
		basic = b;
	}
	
	float calculateSalary()
	{
		float da,hra, medical, pf, insurance, gross;
		da = basic * 0.15f;
		hra = basic * 0.1f;
		medical = basic * 0.04f;
		gross = basic=da=hra=medical;
		insurance = gross * 0.07f;
		float net = gross - pf - insurance;
		return net;
	}
	
class Salary
{
	public static void main(String args[])
	{
		Scanner sc = new scanner(System.in);
		System.out.println("Enter the Employee ");
		
		String name = sc.nextLine();
		System.out.println("Enter Designation of  Employee ");
		
		String name = sc.nextLine();
		System.out.println("Enter basic salary of  Employee ");
	
		int basic = sc.nextInt();
		Employee emp1 = new Employee(name, design, basic);
		System.out.println("Salary of Employee 1="+emp1.calculateSalary());
	}
}
}
