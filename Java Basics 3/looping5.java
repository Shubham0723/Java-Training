class looping5{
	public static void main(String[] args) {
		int no,rem,sum=0;
		System.out.print("Enter number: ");
		no=new java.util.Scanner(System.in).nextInt();
		int nsave=no;

		while(no>0){
			rem=no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;
		}
		if(sum==nsave){
			System.out.println(nsave+" is an armstrong number.");
		}
		else{
			System.out.println(nsave+" is not an armstrong number.");
		}
	}
}