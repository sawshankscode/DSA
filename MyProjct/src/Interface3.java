interface Abc1{				//default method in interface i.e defining methid in interface
	void abc();
	default void show() {
		System.out.println("Hello G");}
	}
class Def implements Abc1{
	public void abc() {
		System.out.println("Kemcho mjama? khana kha k jana");
	}
}
public class Interface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc1 bj= new Def();
		bj.show();
		bj.abc();

	}

}
