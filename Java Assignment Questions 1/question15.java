import java.util.Scanner;
class question15{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1: ");
		float num1 = sc.nextFloat();
		System.out.print("Enter num2: ");
		float num2 = sc.nextFloat();

		float sum=num1+num2;

		if(sum>10){
			System.out.println("Sum is greater than 10");
		}
		else{
			System.out.println("Sum is less than 10");
		}
	}
}