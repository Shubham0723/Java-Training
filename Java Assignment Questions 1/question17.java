import java.util.*;
class question17{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("Enter value1: ");
			int a=sc.nextInt();
			System.out.print("Enter value2: ");
			int b=sc.nextInt();
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			System.out.println("Select any choice: ");
			int n=sc.nextInt();

			switch(n){
			case 1: System.out.println("Addition is: "+(a+b));
					break;
			case 2: System.out.println("Subtraction is: "+(a-b));
					break;
			case 3: System.out.println("Multiplication is: "+(a*b));
					break;
			case 4: System.out.println("Division is: "+(a/b));
					break;
		    case 5: System.exit(0);
		    default: System.out.println("Invalid");
			}
		}
	}
}