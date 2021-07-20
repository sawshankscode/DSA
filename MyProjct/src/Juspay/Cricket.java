package Juspay;

import java.util.Scanner;

public class Cricket {



		// TODO Auto-generated method stub
		public static int distance[] = new int[1001];
		public static boolean vis[] = new boolean[1001];
		public static int cost[][] = new int[1001][1001];
		public static int t=0;


		public static int wait(int distofminpos,int minpos,int k) {

			int next_signal=t;
			while(distofminpos>next_signal)
				{next_signal+=t;
			
				}

			return (next_signal-distofminpos);
				
			
		}

		
		public static void calc2(int n, int s) {
			int flag[] = new int[n + 1];
			int i, minpos = 1, k, c, minimum;
			for (i = 1; i <= n; i++) {
			flag[i] = 0;
			distance[i] = cost[s][i];
			}
			c = 2;
			while (c <= n) {
			minimum = 1001;
			for (k = 1; k <= n; k++) {
			if (distance[k] < minimum && flag[k] != 1) {
			minimum = distance[k];

			minpos = k;
			}
			}
			flag[minpos] = 1;
			c++;
			for (k = 1; k <= n; k++) {

			if ( distance[minpos]+wait(distance[minpos],minpos,k) +  cost[minpos][k] <  distance[k] && flag[k] != 11 && vis[minpos]!=true) {
				
			//vis[minpos]=true;
			 distance[k] =  distance[minpos] +cost[minpos][k]+wait(distance[minpos],minpos,k);}
			}
			}
			}

		public static void main(String args[]) {
			int n,m, source,dest,x, i,j,c;

		Scanner in = new Scanner(System.in);

		
		n = in.nextInt();
		m = in.nextInt();
		source =1;
		dest=n;
		t=in.nextInt();
		c=in.nextInt();

			
		//enter cost matrix by edges
		for( x=0;x<m;++x)
		{ i= in.nextInt();
		j = in.nextInt();
		cost[i][j]=c;
		cost[j][i]=cost[i][j];

			}
		for( x=1;x<=n;++x)
			for( int y=1;y<=n;++y)
		if (cost[x][y]==0)
			cost[x][y]=cost[y][x]=1001;




//		 calc(n, source);
//
		
//		System.out.println(distance[dest-1]!=999?distance[dest-1]:-1);
//		 System.out.println(distance[dest]);
		calc2(n,source);
//		for(int p:distance)
//			System.out.print(p+" ");
		int min=distance[dest]!=1001?distance[dest]:-1;
		int sec_min=distance[dest-1]!=1001?distance[dest-1]:-1;
		System.out.println(min+" "+sec_min);
		in.close();
		}

}
