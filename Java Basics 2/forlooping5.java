class forlooping5{
	public static void main(String[] args) {
		int x;
		System.out.print("Enter x: ");
		x=new java.util.Scanner(System.in).nextInt();
		int n;
		System.out.print("Enter n: ");
		n=new java.util.Scanner(System.in).nextInt();
		int sum=1;

		for(int i=1;i<=n;i++){
			int no=i;
			int fact=1;
			while(no>0){
				fact=fact*no;
				no--;
			}
			sum+=(Math.pow(x,i))/fact;
		}
		System.out.println("Sum of series: "+sum);
	}
}