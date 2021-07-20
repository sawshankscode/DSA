package Map;

public class RelativeSorting {
	public static void main (String[] args)throws IOException {
		//code
			BufferedReader br = new BufferedReader( 
                new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine());
		while(t--!=0) {
		     String[] input = br.readLine().trim().split("\\s+");
			int n= Integer.parseInt(input[0]);
			int m= Integer.parseInt(input[1]);
			int a1[]=new int[n];
			int a2[]=new int[m];
		    String[] in = br.readLine().trim().split("\\s+");
		    for(int i=0;i<n;i++){
		        a1[i]=Integer.parseInt( in[i]);
		    }
		    String[] in2 = br.readLine().trim().split("\\s+");
		    for(int i=0;i<m;i++){
		        a2[i]=Integer.parseInt( in2[i]);
		    }
		     Map<Integer, Integer> lookup = new TreeMap<>(); // map to keep count in sorted order
            for(int e: a1) {
                lookup.merge(e, 1, Integer::sum); // if exist increment count
            }
            for(int e: a2) {
                if(lookup.containsKey(e)) {
                    while(lookup.get(e) > 0) {
                        System.out.print(e + " ");
                        lookup.merge(e, -1, Integer::sum);
                    }
                    lookup.remove(e);
                }
            }
            for(int e: lookup.keySet()) {
                while(lookup.get(e) > 0) {
                        System.out.print(e + " ");
                        lookup.merge(e, -1, Integer::sum);
                    }
		    }
            System.out.println(); // new line for next testcase
	    }
	 }
}
