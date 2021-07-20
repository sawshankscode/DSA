package Map;

public class quadiple {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int sum=sc.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    Arrays.sort(arr);
		    LinkedList<String> set=new LinkedList<String>();
		    String str=" ";
		    for(int i=0;i<n-3;i++)
		    {
		        str="";
		        for(int j=i+1;j<n-2;j++)
		        {
		            for(int k=j+1;k<n-1;k++)
		            {
		                for(int l=k+1;l<n;l++)
		                {
		                    if(arr[i]+arr[j]+arr[k]+arr[l]==sum)
		                    {
		                       str=arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[l]+" "+"$";
		                       if(!set.contains(str)){
		                           set.add(str);
		                       }
		                    }
		                }
		            }
		        }
		    }
		    if(set.size()==0)
		    System.out.print("-1");
		    else{
		    Iterator it=set.iterator();
		    while(it.hasNext())
		    {
		        System.out.print(it.next());
		    }
		    }
		    System.out.println();
		}
	}
}
