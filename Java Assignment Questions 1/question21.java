import java.util.Scanner;
class question21{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks1: ");
		int m1=sc.nextInt();
		System.out.print("Enter marks2: ");
		int m2=sc.nextInt();
		System.out.print("Enter marks3: ");
		int m3=sc.nextInt();
		System.out.print("Enter marks4: ");
		int m4=sc.nextInt();
		System.out.print("Enter marks5: ");
		int m5=sc.nextInt();
		char gender1='m';
		char gender2='f';

		int total_marks=m1+m2+m3+m4+m5;
		System.out.println("Total marks: "+total_marks);
		float percentage=(float)(total_marks*100)/300;
		System.out.println("Percentage: "+percentage);
		if(percentage>=60 && gender1=='m'){
			System.out.println("You are eligible for admission");
		}
		else if (percentage>=80 && gender2=='f') {
			System.out.println("You are eligible for admission");
		}
		else{
			System.out.println("Cannot take admission");
		}
	}
}