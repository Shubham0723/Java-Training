import java.util.*;
class LeapYear{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year=sc.nextInt();

		if(year%100!=0){
			if(year%4==0){
				System.out.println("Leap year");
			}else{
				System.out.println("Not leap year");
			}
		}
		else{
			if(year%400==0){
				System.out.println("Century Leap year");
			}else{
				System.out.println("Not leap year");
			}
		}
	}
}