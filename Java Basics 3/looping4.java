class looping4{
	public static void main(String[] args) {
		double no,fact=1;
		System.out.print("Enter number: ");
		no=new java.util.Scanner(System.in).nextDouble();

		while(no>0){
			fact=fact*no;
			no--;
		}
		System.out.println("Factorial of is "+fact);
	}
}