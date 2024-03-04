// class Test5{
// 	int i=5;
// 	static public void show(){
// 	  System.out.println("value of i="+i);
// 	}
// 	public static void main(String args[]){
// 	  Test.show();
// 	}
// }

//solving error
class Test5{
	static int i=5;
	static public void show(){
	  System.out.println("value of i="+i);
	}
	public static void main(String args[]){
	  Test5.show();
	}
}