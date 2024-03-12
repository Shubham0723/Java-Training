import java.util.Scanner;
class question8{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		float num= sc.nextFloat();

		if(num>0){
			System.out.println("Positive Number");
		}
		else if(num<0){
			System.out.println("Negative Number");
		}
		else{
			System.out.println("Zero");
		}
	}
}