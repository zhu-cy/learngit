package FirstPackage;

public class texe_2 {
	
		static void testMath() {
		int a=(int)(Math.random()*100);
		int b=(int)(Math.random()*100);
//		+ -* /
		System.out.println(a);
		System.out.println(b);
		int result;
		result=a+b;
		System.out.println(result);
		result=a*b;
		System.out.println(result);
		if(b!=0) {
			result=a/b;
			System.out.println(result);
			result=a*b;
			System.out.println(result); 
		}
		else
			System.out.println("错误");
		}
		
		static void testRelation() {
//			比较大小
			boolean result;
			int a=(int)(Math.random()*100);
			int b=(int)(Math.random()*100);
			System.out.println(a);
			System.out.println(b);
			result=a<b;
			System.out.println("a<b : "+result);
			result=a>b;
			System.out.println("a>b : "+result);
			result=a==b;
			System.out.println("a==b : "+result);
			result=a!=b;
			System.out.println("a!=b : "+result);
			result=a>=b;
			System.out.println("a>=b : "+result);
			result=a<=b;
			System.out.println("a<=b : "+result);
			
		}
		
		static void testLogic(){
//			逻辑运算
			int HEIGHT=185;
			int WEIGHT=80;
			int MONEY=100000;
			int h=165;
			int w=100;
			int m=200000;
			boolean result;
			result=h > HEIGHT & w <WEIGHT & m > MONEY;
			System.out.println(result);
			result=h>HEIGHT | w<WEIGHT | m>MONEY;
			System.out.println(result);
			boolean fal;
			fal=true;
			System.out.println(!fal);
			int a=1,b=2,c=3;
			if(a>b&&c++>10) {
				System.out.println("run");
			}
			System.out.println(c);
			if(a<b||c++>10) {
				System.out.println("run");
			}
			System.out.println(c);
			
		
		}
	public static void main(String[] a) {
//		testMath();
//		testRelation();
		testLogic();
	}
		
	
}

