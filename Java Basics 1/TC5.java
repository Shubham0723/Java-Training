// class TC5{
// 	public static void main(String[] args) {
// 		long l=7558627586;
// 		System.out.println(l);
// 	}
// }

// E:\Java Placement Training (Roll No-43)>javac TC5.java
// TC5.java:3: error: integer number too large
//                 long l=7558627586;
//                        ^
// 1 error

//Solution
class TC5{
	public static void main(String[] args) {
		long l=7558627586l;
		System.out.println(l);
	}
}