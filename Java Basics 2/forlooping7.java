class forlooping7{
	public static void main(String[] args) {
		int a,b;
		System.out.print("Enter a: ");
		a=new java.util.Scanner(System.in).nextInt();
		System.out.print("Enter b: ");
		b=new java.util.Scanner(System.in).nextInt();
		int res=a*b;
		int sum=0;

		for (int i=1;i<=b ;i++ ) {
			sum=sum+a;
		}
		System.out.println("result is: "+sum);
	}
}