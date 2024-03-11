import java.util.*;
class SwitchEx{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount ");
		int amt=sc.nextInt();
		
		System.out.print("Enter notes ");
		int notes=sc.nextInt();

		int n=0;

		switch(notes){
		case 2000:  n=amt/2000;
				   amt=amt%2000;
				   System.out.println("Notes of 2000 are :" + n);
		case 500:  n=amt/500;
				   amt=amt%500;
				   System.out.println("Notes of 500 are :" + n);
		case 200:  n=amt/200;
				   amt=amt%200;
				   System.out.println("Notes of 20 are :" + n);
		case 100:  n=amt/100;
				   amt=amt%100;
				   System.out.println("Notes of 100 are :" + n);
		case 50:  n=amt/50;
				   amt=amt%50;
				   System.out.println("Notes of 50 are :" + n);
		case 20:  n=amt/20;
				   amt=amt%20;
				   System.out.println("Notes of 20 are :" + n);
		case 10:  n=amt/10;
				   amt=amt%10;
				   System.out.println("Notes of 10 are :" + n);
		case 5:  n=amt/5;
				   amt=amt%5;
				   System.out.println("Notes of 5 are :" + n);
		case 2:  n=amt/2;
				   amt=amt%2;
				   System.out.println("Notes of 2 are :" + n);
		}
	}
}