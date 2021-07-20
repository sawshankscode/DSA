

	abstract class Writer{
		public abstract void write(); 
		public abstract void read();
			
	}
	class Pencil extends Writer{
		public void write() {
			System.out.println("I am a Pencil");
		}
	}
	class Pen extends Writer{
		public void write() {
			System.out.println("I am a Pen");
		}
	}
	class Kit{
		public void doSomething(Writer p)
		{
			p.write();
		}
	}
	
	public class AbstractClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kit k = new Kit();
		Writer p=new Pen();
		Writer pc=new Pencil();
		k.doSomething(p);
		k.doSomething(pc);
		
	}

}
