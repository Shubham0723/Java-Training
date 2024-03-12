import java.util.Scanner;
class question9{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1: ");
		float n1=sc.nextFloat();
		System.out.print("Enter num2: ");
		float n2=sc.nextFloat();
		System.out.print("Enter num3: ");
		float n3=sc.nextFloat();

		if(n1>=n2){
			if(n1>=n3){
				System.out.println(n1+" is the largest number.");
			}
			else{
				System.out.println(n3+" is the largest number.");
			}
		}
		else{
			if(n2>=n3){
				System.out.println(n2+" is the largest number.");
			}
			else{
				System.out.println(n3+" is the largest number.");
			}
		}
	}
}