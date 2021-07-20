package Juspay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

import Juspay.NaggingReactDev.FastReader;

public class ShortestPathbetweenNewBieAndExpert {
	 static class FastReader{ BufferedReader br;StringTokenizer st;public FastReader(){br = new BufferedReader(new InputStreamReader(System.in));}String next(){while (st == null || !st.hasMoreElements()){try{st = new StringTokenizer(br.readLine());}catch (IOException  e){e.printStackTrace();}}return st.nextToken();}int nextInt(){ return Integer.parseInt(next());}long nextLong(){return Long.parseLong(next());}double nextDouble(){return Double.parseDouble(next());}String nextLine(){String str = ""; try{str = br.readLine(); } catch (IOException e) {e.printStackTrace();} return str; }}
	  static FastReader fr = new FastReader();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=fr.nextInt();
		int Max=Integer.MIN_VALUE;
		for(int i =0;i<N;i++) {
			int z=fr.nextInt();
			Max=Math.max(Max, z);
		}
		int dist[][]=new int[Max+1][Max+1];
		for(int i=1;i<Max+1;i++)
		for(int j=1;j<Max+1;j++)
		dist[i][j]=100001;
		int e=fr.nextInt();
		for(int i=0;i<e;i++)
		{
		int u=fr.nextInt();
		int v=fr.nextInt();
		int dt=fr.nextInt();
		dist[u][v]=dt;
		
		}
		 
		int newb=fr.nextInt();
		int expert=fr.nextInt();
	
		for(int k=1;k<Max+1;k++)
		for(int i=1;i<Max+1;i++)
		for(int j=1;j<Max+1;j++)
		if(dist[i][j]>dist[i][k]+dist[k][j])
		dist[i][j]=dist[i][k]+dist[k][j];
		
		int res=dist[newb][expert];
		System.out.println(res!=100001?res:-1);


		
	}

}

def func(g,s,f):
    
    qt=[]
    ct=[]
    dis=[]
    pt=[]
    for _ in range(len(g)):
        dis.append(9999)
        pt.append(None)
        ct.append('w')
    qt.append(s)
    dis[s]=0
    ct[s]='g'
    while len(qt)!=0:
        u=qt.pop(0)
        if u==f:
            return True
        ct[u]='b'
        for i in g[u]:
            if ct[i]=='w':
                qt.append(i)
                ct[i]='g'
                dis[i]=dis[u]+6
                pt[i]=u
    return False

idt={}
n=int(input())
for i in range(n):
    x=int(input())
    idt[x]=i+1
m=int(input())
g=[[] for _ in range(n+1)]
for _ in range(m):
    x,y=map(int,input().split())
    g[idt[x]].append(idt[y])
s=idt[int(input())]
f=idt[int(input())]
if func(g,s,f)==True:
    print("1")
else:
    print("0")

    
    
    
    
    
    
    
	 static class FastReader{ BufferedReader br;StringTokenizer st;public FastReader(){br = new BufferedReader(new InputStreamReader(System.in));}String next(){while (st == null || !st.hasMoreElements()){try{st = new StringTokenizer(br.readLine());}catch (IOException  e){e.printStackTrace();}}return st.nextToken();}int nextInt(){ return Integer.parseInt(next());}long nextLong(){return Long.parseLong(next());}double nextDouble(){return Double.parseDouble(next());}String nextLine(){String str = ""; try{str = br.readLine(); } catch (IOException e) {e.printStackTrace();} return str; }}
static FastReader sc = new FastReader();
	  static PrintWriter out = new PrintWriter(System.out);
	  static ArrayList<Integer> ans=new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		//Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Map<Integer,ArrayList<Integer>> adj=new HashMap<>();
		ArrayList<Integer> mem=new ArrayList<>();
		int max=Integer.MIN_VALUE;
		for(int i =0;i<n;i++) {
			int x=sc.nextInt();
			max=Math.max(max, x);
			adj.put(x,new ArrayList<>());
		}
		
		int m=sc.nextInt();
		for(int i=0;i<m;i++) {
			int u=sc.nextInt();
			int v=sc.nextInt();
			adj.get(u).add(v);
		}
		int follower=sc.nextInt();
		int following=sc.nextInt();
		
//		for(int i:adj.get(follower) ) {
//			if(i==following)
//				ans.add(follower);
//		}
		//System.out.println(isReachable(adj,follower,following,max+1)?"1":"0");
		Nagg(adj,follower,following,max+1);
		 
			
		

	}

	private static boolean isReachable(Map<Integer,ArrayList<Integer>>  adj, int follower, int following,int n) {
		// TODO Auto-generated method stub
		 boolean visited[]=new boolean[n];
	        Queue<Integer> q=new LinkedList<>();
	        ArrayList<Integer> ans=new ArrayList<>();
	        visited[follower]=true;
	        q.add(follower);
	        while(!q.isEmpty()){
	            int temp=q.poll();
	            for(int i:adj.get(temp)){
	            	if(i==following)
	            		return true;
	                if(!visited[i]){
	                    q.add(i);
	                    visited[i]=true;
	                }
	            }
	        }
	  
		return false;
	}
	private static void Nagg(Map<Integer,ArrayList<Integer>>  adj, int follower, int following,int n) {
		// TODO Auto-generated method stub
		 boolean visited[]=new boolean[n];
	        Queue<Integer> q=new LinkedList<>();
	        ArrayList<Integer> ans=new ArrayList<>();
	        visited[follower]=true;
	        q.add(follower);
	        while(!q.isEmpty()){
	            int temp=q.poll();
	            for(int i:adj.get(temp)){
	            	if(visited[i]!=true) {
	            		if(i==following)
	            			ans.add(temp);
	            		else  {
	            			visited[i]=true;
	            			q.add(i);
	            		}
	               
	                } 
	            }
	        }
	        if(ans.size()==0)
	        	System.out.println(-1);
	        else {
	        Collections.sort(ans);
			for(int i:ans)
				System.out.print(i+" ");
	        }
	       
	      
	  
	}
	
	#include<bits/stdc++.h>
	using namespace std;
	#define int long long
	map <int, vector <int> > graph;
	map <int,bool> done;
	vector<int> ans;
	int x,y;
	bool dfs(int i)
	{
	   if(i==x)
	   {
	       return true;
	   }
	   if(done[i])
	   return false;
	   done[i]=true;
	   bool check=false;
	   for(auto p:graph[i])
	   {
	       if(!done[p])
	       check=dfs(p);
	       if(check)
	       {
	          done[i]=false;
	          return true;
	       }
	   }
	    done[i]=false;
	    return false;
	   
	}
	int32_t main(){

	int n,m;
	cin>>n;
	for(int i=0;i<n;i++)
	{
	    cin>>x;
	    graph[x];
	    done[x]=false;
	}

	cin>>m;
	for(int i=0;i<m;i++)
	{
	    cin>>x>>y;
	    graph[y].emplace_back(x);
	}
	cin>>x>>y;
	for(auto p:graph[y])
	{
	   if(dfs(p))
	   {
	       ans.push_back(p);
	   }
	}
	if(ans.size()>0){
	for(auto p:ans)
	cout<<p<<" ";
	}
	else
	{
	    cout<<-1<<" ";
	}
	cout<<endl;
	}
