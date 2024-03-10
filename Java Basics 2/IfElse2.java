class IfElse2{
	public static void main(String[] args) {
		int p1=40,p2=20,p3=50;
		char gender = 'f';
		int obtained_marks=p1+p2+p3;
		float percentage=(float)(obtained_marks*100)/300;
		if(percentage>=62 && gender=='f'){
			System.out.println("Can take admission");
		}
		else{
			System.out.println("Cannot take admission");
		}
	}
}