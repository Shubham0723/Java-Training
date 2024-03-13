class question5{
	public static void main(String[] args) {
		int no=0,rev,rem;
		for(int i=1;i<=9999;i++){
			no=i;
			rev=0;
			while(no>0){
				rem=no%10;
				rev=rev*10+rem;
				no=no/10;
			}
			if(i==rev){
				System.out.print(i+" ");
			}
		}
	}
}