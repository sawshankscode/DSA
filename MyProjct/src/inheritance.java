class Calc
	{
	
		public void show()
		{
			System.out.println("in calc");
		}
	}
	
class Calcadv extends Calc
{
	
	public void show()
	{
		super.show();
		System.out.println("in calcadv");
		
	}
}
class Calcadv2 extends Calc
{
	public void show()
	{
		System.out.println("in calcadv2");
		
;	}
}
public class inheritance {
	
	public static void main(String[] args) {
		Calc c1= new Calcadv();
		c1.show();
		c1=new Calcadv2();
		
		c1.show();
		
		
	}

	
}
