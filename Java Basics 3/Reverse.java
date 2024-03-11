//Reverse of 4 digit number

//1st method

// class Reverse{
// 	public static void main(String args[]){
// 		int num=1234;
// 		int ans=0;

// 		int n=num%10;
// 		num=num/10;
// 		ans=ans*10+n;
		
// 		int n1=num%10;
// 		num=num/10;
// 		ans=ans*10+n1;
		
// 		int n2=num%10;
// 		num=num/10;
// 		ans=ans*10+n2;
		
// 		int n3=num%10;
// 		num=num/10;
// 		ans=ans*10+n3;
// 		System.out.print(ans);
// 	}
// }

//2nd method(easy)

class Reverse{
	public static void main(String args[]){
		int num=6789;
		int n1=num%10;
		num=num/10;
		int n2=num%10;
		num=num/10;
		int n3=num%10;
		num=num/10;
		int n4=num%10;
		num=num/10;
		int res=n1*1000+n2*100+n3*10+n4*1;
		System.out.println(res);
	}
}