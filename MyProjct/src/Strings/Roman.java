package Strings;




import java.util.*;
import java.lang.*;
import java.io.*;

public class Roman {
	public static void main (String[] args) throws IOException{
		//code
		BufferedReader br = new BufferedReader( 
                new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine());
		while(t--!=0) {
			
		    String[] in = br.readLine().trim().split("\\s+");
		    String s1=(String)in[0];
		    int d=romans(s1);
		    System.out.println(d);
	}
}
    static int romans(String s1){
        char roman[]=s1.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int res=0,i=0;
    //res += hmap[roman.at(0)];
    if(roman.length<=1)
    {
        return map.get(roman[0]);
    }
    else
    {
        while(i<roman.length-1)
        {
            if(map.get(roman[i])<map.get(roman[i+1]))
            {
                res += map.get(roman[i+1])-map.get(roman[i]);
                i += 2;
            }
            else
            {
                res += map.get(roman[i]);
                i++;
            }
            if(i==roman.length-1)
            res += map.get(roman[i]);
        }
        
    return res;
    }
    }
}