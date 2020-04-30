package FirstPackage;

public class texe_1 {
	public static void main(String[] a) {
		Boy Kite=new Boy();
		Kite.Eat();
		Kite.Sleep();
		Kite.Get();
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Long.SIZE);
		System.out.println(Integer.SIZE);
		
		
	}

}
class Boy{
	int Age=18;
	String Name="Kite";
	public void Eat() {
		System.out.println("eat");
	}
	public void Sleep() {
		System.out.println("sleep");
	}
	public void Get() {
		System.out.println(Name+","+Age);
	}
	
}
