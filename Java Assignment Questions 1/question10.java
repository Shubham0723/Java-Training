import java.util.Scanner;
class question10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter percentage: ");
		float p= sc.nextFloat();

		if(p>=90){
			System.out.println("A Grade");
		}
		else if (p>=80 && p<90) {
			System.out.println("B Grade");
		}
		else if (p>=70 && p<80) {
			System.out.println("C Grade");
		}
		else if (p>=60 && p<70) {
			System.out.println("D Grade");
		}
		else if (p>=50 && p<60) {
			System.out.println("E Grade");
		}
		else{
			System.out.println("Fail");
		}
	}
}

