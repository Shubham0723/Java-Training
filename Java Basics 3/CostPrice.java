import java.util.*;
class CostPrice{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter cost price: ");
		int cp=sc.nextInt();

		System.out.print("Are you a student?? ");
		String s=sc.next();

		if(s.equals("y")){
			if(cp>500){
				System.out.println("Discount of 10%.");
			}else{
				System.out.println("Discount of 5%.");
			}
		}
		if(s.equals("n")){
			if(cp>500){
				System.out.println("Discount of 5%.");
			}else{
				System.out.println("Discount of 2%.");
			}
		}
	}
}