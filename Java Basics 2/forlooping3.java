class forlooping3{
	public static void main(String[] args) {
		int f0=0,f1=1,f2,no;
		System.out.print("Enter number: ");
		no=new java.util.Scanner(System.in).nextInt();
		System.out.println(f0+"\n"+f1);

		for(int i=3;i<=no;i++){
			f2=f0+f1;
			System.out.println("\n"+f2);
			f0=f1;
			f1=f2;
		}

	}
}