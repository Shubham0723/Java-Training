// class TC3{
// 	public static void main(String args[]){
// 	  float a=3.14;
// 	  System.out.println(a);
// 	}
// }
// E:\Java Placement Training (Roll No-43)>javac TC3.java
// TC3.java:3: error: incompatible types: possible lossy conversion from double to float
//           float a=3.14;
//                   ^
// 1 error

//Solution
class TC3{
	public static void main(String args[]){
	  float a=3.14f;
	  System.out.println(a);
	}
}