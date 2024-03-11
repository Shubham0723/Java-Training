class looping6{
	public static void main(String[] args) {
		int no,rem,rev=0;
		System.out.print("Enter number: ");
		no=new java.util.Scanner(System.in).nextInt();
		int nsave=no;

		while(no>0){
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		if(rev==nsave){
			System.out.println(nsave+" is a palindrome number.");
		}
		else{
			System.out.println(nsave+" is not a palindrome number.");
		}
	}
}