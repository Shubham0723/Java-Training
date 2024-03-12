import java.util.Scanner;
class question19{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();

		int sum=(n*(n+1));
		System.out.println("Sum of first "+n+" even numbers is "+sum);
	}
}