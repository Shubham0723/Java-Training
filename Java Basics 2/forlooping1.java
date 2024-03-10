class forlooping1{
	public static void main(String[] args) {
		int no,fact=1;
		System.out.print("Enter number: ");
		no=new java.util.Scanner(System.in).nextInt();

		for (int i=1;i<=no ;i++ ) {
			fact=fact*i;
		}
		System.out.println("Factorial is "+fact);
	}
}