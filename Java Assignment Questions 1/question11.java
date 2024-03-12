import java.util.Scanner;
class question11{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Basic Salary: ");
		int bsal= sc.nextInt();
		int da= 2000;
		int ta= 3000;
		int hr= 5000;

		int GrossSalary=bsal+da+ta+hr;
		System.out.println("Daily Allowance: "+da);
		System.out.println("Travelling Allowance: "+ta);
		System.out.println("House Rent: "+hr);
		System.out.println("Gross Salary of the employee is: " + GrossSalary);
	}
}