import java.util.Scanner;
class question2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = sc.nextInt();

		if(year%4==0){
			if(year%100==0){
				if(year%400==0){
					System.out.println("It is a century leap year");
				}
				else{
					System.out.println("It is not a leap year");
				}
			}
			else{
				System.out.println("It is not a century leap year but normal leap year");
			}
		}
		else{
			System.out.println("It is not a leap year");
		}
	}
}