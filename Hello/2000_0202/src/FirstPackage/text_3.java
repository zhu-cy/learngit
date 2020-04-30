package FirstPackage;

public class text_3{
	//×Ö·û´®
	
	static void testScr_1() {
		String name="Tom";
		System.out.println(name);
		String name1=new String("Kite");
		System.out.println(name1);
		System.out.println(name.length());
		System.out.println(name1.length());
	}
	 
	static void testScr_2() {
		String s1="zhu ";
		String s2 ="jintai";
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
	}
	
	static void testScr_3() {
		int age=18;
		String name="Ð¡Àö";
		double salary=3000.8;
		String msg=String.format("name : %s, age  : %d ,salary: %.2f",name,age ,salary);
		System.out.println(msg);
	}
	
	
	public static void main(String[] args) {
		testScr_3();
		
	}
}