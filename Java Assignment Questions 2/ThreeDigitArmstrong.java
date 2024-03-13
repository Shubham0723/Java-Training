class ThreeDigitArmstrong{
	public static void main(String[] args) {
		int result=0;
		for(int i=1;i<=10000;i++)
		{
		int no,rem,sum=0,count=0,countNum;
		no=i;
		countNum=i;
		while(countNum>0){
			countNum/=10;
			count++;
		}
		while(no>0){
			rem=no%10;
			sum += Math.pow(rem,count);
			no=no/10;
		}
		if(sum==i){
			System.out.print(i+" ");
			if(count==3){
				result=result+sum;
			}
		 }
	  }
	  System.out.println("Sum of 3 digit number: "+result);
	}
}