//Sum of 4 digits of a number

class Sum{
	public static void main(String args[]){
	  int num=5646;
	  int n1=num%10;
	  num=num/10;
	  int n2=num%10;
	  num=num/10;
	  int n3=num%10;
	  num=num/10;
	  int n4=num%10;

	  int res=n1+n2+n3+n4;
	  System.out.println("The sum of 4 digits is "+res);
	}
}