//Type of Interface
//1. Normal Interface (more than 1 method)
//2. Single abstract interface - Functional interface (single method)
//3. Marker interface (no method)
@FunctionalInterface
interface Write{
	void write();
}
	class Marker implements Write
	{
		public void write() {
			System.out.println("I am a Pen");
		}
	}
	class Eraser implements Write{
		public void write() {
			System.out.println("I am an Eraser");
		}
	}
	class Kitt {
		public void doSomething(Write p) {
			p.write();
		}
	}
 
public class Interface {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Kitt k=new Kitt();
		 Write p=new Eraser();
		 k.doSomething(p);
		
	
		    } 
}
	
	
