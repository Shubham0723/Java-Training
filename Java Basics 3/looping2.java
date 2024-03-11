class looping2{
	public static void main(String[] args) {
		int no,rem,sum=0;
		System.out.print("Enter a number: ");
		no= new java.util.Scanner(System.in).nextInt();

		while(no>0){
			rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		System.out.println("Sum is: "+sum);
	}
}