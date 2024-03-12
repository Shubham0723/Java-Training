import java.util.Scanner;
class question5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter angle1: ");
		int a = sc.nextInt();
		System.out.print("Enter angle2: ");
		int b = sc.nextInt();
		System.out.print("Enter angle3: ");
		int c = sc.nextInt();

		if(a+b<=c || a+c<=b || b+c<=a){
			System.out.println("It is not a triangle");
		}
		else{
			System.out.println("It is a triangle");
		}
	}
}