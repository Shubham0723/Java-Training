class forlooping4{
	public static void main(String[] args) {
		double x;
		System.out.print("Enter x: ");
		x=new java.util.Scanner(System.in).nextInt();
		double n;
		System.out.print("Enter n: ");
		n=new java.util.Scanner(System.in).nextInt();
		double sum=1;

		for (int i=1;i<=n ;i++ ) {
			sum+=(Math.pow(x,i))/i;
		}
		System.out.println("Sum of series is: "+sum);
	}
}