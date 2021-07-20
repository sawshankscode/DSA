public class Pair<X,Y>{
		X x;
		Y y;
		public  Pair(X x,Y y) {
			this.x=x;
			this.y=y;
		}
		public void print()
		{
			System.out.println(x+" "+y);
		}
}