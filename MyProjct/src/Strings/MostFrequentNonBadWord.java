package Strings;
import java.util.*;
public class MostFrequentNonBadWord {
	static String MostFrequent(String paragraph, List<String> taboo) 
    {
        // code here
        Set<String> badWords=new HashSet<>();
        for(int i=0;i<taboo.size();i++)
            badWords.add(taboo.get(i));
        Map<String,Integer> map=new HashMap<>();    
        String para[]=paragraph.trim().split("\\W+");
        for(String s:para){
            if(!badWords.contains(s.toLowerCase()))
                map.merge(s.toLowerCase(),1,Integer::sum);
        }
        String res=new String();
        int max=0;
        for(Map.Entry<String,Integer> e:map.entrySet())
            if(e.getValue()>max){
                max=e.getValue();
                res=e.getKey();
            }
            return res;
    }
}
