//While Looping
class looping1{
	public static void main(String[] args) {
		int no,count=0;
		System.out.print("Enter a number: ");
		no= new java.util.Scanner(System.in).nextInt();

		while(no>0){
			no=no/10;
			count++;
		}
		System.out.println("No.of digits are: "+count);
	}
}