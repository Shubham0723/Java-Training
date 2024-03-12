import java.util.Scanner;
class question3{
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();

		if(age>=18){
			System.out.println("He is eligible for voting.");
		}
		else{
			System.out.println("he is not eligible for voting");
		}
	}
}