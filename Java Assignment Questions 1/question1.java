import java.util.*;
class question1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();

		if(a<20){
			System.out.println("Number less than 20");
		}
		else{
			System.out.println("Number greater than 20");
		}
	}
}