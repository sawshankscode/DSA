package Map;
import java.util.*;
public class PatternMatching {
	public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern)
	{
	    //add code here.
	    String p=getPattern(pattern);
	    ArrayList<String> res=new ArrayList<>();
	    for(String s:dict){
	        if(getPattern(s).equals(p))
	            res.add(s);
	    }
	    return res;
	}
	public static String getPattern(String s){
	    Map<Character,Integer> map=new HashMap<>();
	    StringBuilder sb=new StringBuilder();
	    for(char c:s.toCharArray()){
	        map.put(c,map.getOrDefault(c,0)+1);
	        sb.append(map.get(c));
	    }
	    return sb.toString();
	}
}
