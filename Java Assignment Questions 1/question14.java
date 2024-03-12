import java.util.Scanner;
class question14{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter side1: ");
		float side1 = sc.nextFloat();
		System.out.print("Enter side2: ");
		float side2 = sc.nextFloat();
		System.out.print("Enter side3: ");
		float side3 = sc.nextFloat();

		if(side1==side2 && side2==side3){
			System.out.println("It is an equilateral triangle");
		}
		else if (side1==side2 || side1==side3 || side2==side3) {
			System.out.println("It is an isoceles triangle");
		}
		else{
			System.out.println("It is an scalene triangle");
		}
	}
}