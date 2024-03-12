import java.util.Scanner;
class question7{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch=sc.next().charAt(0);

		if(ch>=65 && ch<=90){
			System.out.println("It is an Upper Case Letter");
		}
		else if(ch>=97 && ch<=122){
			System.out.println("It is a Lower Case Letter");
		}
		else if(ch>=48 && ch<=57){
			System.out.println("It is a Digit");
		}
		else{
			System.out.println("It is a Special Case Character");
		}
	}
}