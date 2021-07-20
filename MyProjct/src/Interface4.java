interface Yes{
	static void show1() 		{		//apart from default method we can also create static  
										// method to access the method without object.
		System.out.println("aila");
		int num=8;						// varioable in interface are by default Final/Const.
	}
}
interface Demo{
default	void show() {
	System.out.println("in Demo");
}
}
interface MyDemo{
	default void show() {
		System.out.println("in MyDemo");
		}
	}
class Demo1 implements Demo,MyDemo{
	public void show() {
		MyDemo.super.show();
	}
}
public class Interface4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj =new Demo1();
		obj.show();
		Yes.show1();
	}

}
