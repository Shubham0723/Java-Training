class forlooping2{
	public static void main(String[] args) {
		int no;
		System.out.print("Enter number: ");
		no=new java.util.Scanner(System.in).nextInt();
		int sum=0;

		for(int i=1;i<=no;i++){
			if(i%2==0){
				sum=sum+i;
			}
		}
		System.out.println("Sum of even numbers: "+sum);
	}
}