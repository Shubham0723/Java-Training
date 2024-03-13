//Sum of fibonacci series
class question2{
	public static void main(String[] args) {
		int f0=0,f1=1,f2,no,sum=1;
		System.out.print("Enter number: ");
		no=new java.util.Scanner(System.in).nextInt();
		System.out.print(f0+"\n"+f1);

		for(int i=3;i<=no;i++){
			f2=f0+f1;
			System.out.print("\n"+f2);
			f0=f1;
			f1=f2;
			sum+=f2;
		}
		System.out.println("Sum of fibonacci series: "+sum);
	}
}