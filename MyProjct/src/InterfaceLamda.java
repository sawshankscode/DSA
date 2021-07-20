interface Abc{
	void show();
}
public class InterfaceLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc obj = () -> System.out.println("Chal Bhaag yahan Se");//Lamda Expression from Scala
		obj.show();
	}

}
