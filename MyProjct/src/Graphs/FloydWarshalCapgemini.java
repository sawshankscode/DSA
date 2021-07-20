package Graphs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class FloydWarshalCapgemini {
	static class FastReader{ BufferedReader br;StringTokenizer st;public FastReader(){br = new BufferedReader(new InputStreamReader(System.in));}String next(){while (st == null || !st.hasMoreElements()){try{st = new StringTokenizer(br.readLine());}catch (IOException  e){e.printStackTrace();}}return st.nextToken();}int nextInt(){ return Integer.parseInt(next());}long nextLong(){return Long.parseLong(next());}double nextDouble(){return Double.parseDouble(next());}String nextLine(){String str = ""; try{str = br.readLine(); } catch (IOException e) {e.printStackTrace();} return str; }}
	  static FastReader fr = new FastReader();
	 static PrintWriter output=new PrintWriter(System.out);
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		BufferedWriter output = new BufferedWriter(
//	            new OutputStreamWriter(System.out));
		int n=fr.nextInt();
		int m=fr.nextInt();
		int dis[][]=new int[n+1][n+1];
		for(int i=1;i<n+1;i++)
			for(int j=1;j<n+1;j++)
				dis[i][j]=100001;
		for(int i=0;i<m;i++) {
			int u=fr.nextInt();
			int v=fr.nextInt();
			int d=fr.nextInt();
			dis[u][v]=d;
			
		}
		for(int i=1;i<n+1;i++)
			dis[i][i]=0;
		int cnt=fr.nextInt();
		
		int R[]=new int[cnt];
		for(int i=0;i<cnt;i++)
			R[i]=fr.nextInt();
		for(int k=1;k<n+1;k++)
			for(int i=1;i<n+1;i++)
				for(int j=1;j<n+1;j++)
					if(dis[i][j]>dis[i][k]+dis[k][j])
						dis[i][j]=dis[i][k]+dis[k][j];


		for(int i=1;i<n+1;i++)
		{
		    int res=100001;
		for(int j=0;j<cnt;j++)
		    res=Math.min(res,dis[i][R[j]]);
		    if(res==100001)
		    	output.write(-1+"\n");
		    else
		    	output.write(res+"\n");
		}
			output.close();
		

	}

}
