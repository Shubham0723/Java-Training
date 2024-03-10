import java.util.*;
class IfElse3{
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter day: ");
		 String day=sc.next();

		 if(day.equals("Sat") || day.equals("Sun")){
		 	System.out.println("Weekend");
		 }
		 else{
		 	System.out.println("Weekday");
		 }
	}
}