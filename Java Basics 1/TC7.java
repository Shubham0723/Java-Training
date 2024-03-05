// class TC7{
// 	public static void main(String[] args) {
// 		byte b=9561467;
// 		System.out.println(b);
// 	}
// }

// E:\Java Placement Training (Roll No-43)>javac TC7.java
// TC7.java:3: error: incompatible types: possible lossy conversion from int to byte
//                 byte b=9561467;
//                        ^
// 1 error

//Solution
class TC7{
	public static void main(String[] args) {
		byte b=(byte)9561467;
		System.out.println(b);
	}
}
