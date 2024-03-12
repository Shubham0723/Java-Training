import java.util.Scanner;
class question6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks1: ");
		float p1= sc.nextFloat();
		System.out.print("Enter marks2: ");
		float p2= sc.nextFloat();
		System.out.print("Enter marks3: ");
		float p3= sc.nextFloat();
		System.out.print("Enter marks4: ");
		float p4= sc.nextFloat();
		System.out.print("Enter marks5: ");
		float p5= sc.nextFloat();

		float total_marks = p1+p2+p3+p4+p5;
		float percentage = (total_marks*100)/500;

		System.out.println("Total marks of the student are: "+total_marks);
		System.out.println("Percentage of the student is: "+percentage);
	}
}