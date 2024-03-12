import java.util.Scanner;
class question13{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter percentage: ");
		int per = sc.nextInt();

		if(per>=75){
			System.out.println("Distinction");
		}
		else if (per>=60) {
			System.out.println("First Class");
		}
		else if (per>=50) {
			System.out.println("Second Class");
		}
		else{
			System.out.println("Fail");
		}
	}
}