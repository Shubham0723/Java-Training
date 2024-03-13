//Sum of first and last digits of a number.
import java.util.*;

class question1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input=sc.nextInt();
		int lD=input%10;  //last digit
		int fD=input;     //first digit
		while(fD>=10){
			fD=fD/10;
			//or we can write fD/=10
		}
		int sum=fD+lD;
		System.out.println("Sum of first and last digit of the number is: "+sum);
	}
}