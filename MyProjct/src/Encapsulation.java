class A{
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Encapsulation {
public static void main(String[] args) {
 A Obj =new A();
 Obj.setRollno(1);
 Obj.setName("babu rao");
 System.out.println(Obj.getRollno());
 System.out.println(Obj.getName());
}
	
}
