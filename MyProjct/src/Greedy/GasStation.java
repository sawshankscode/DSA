package Greedy;

public class GasStation {
		public static void main(String[] args) {
			int petrol[]= {4,6,7,4};
			int distance[]= {6,5,3,5};
			System.out.print(station(petrol,distance));
			
		}
		public static int station(int petrol[],int distance[]) {
			int n=petrol.length;
			int cal=0,start=0,deficit=0;
			for(int i=0;i<n;i++) {
				cal+=petrol[i]-distance[i];
				if(cal<0) {
					start=i+1;
					deficit+=cal;
					cal=0;
				}
			}
			return (cal+deficit)>0?start:-1;
		}
}
