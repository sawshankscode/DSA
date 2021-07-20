package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapMain {
		public static void main(String[] args) {
				Map<String,Integer> map=new HashMap<>();
				map.put("one", 1);
				map.put("two", 2);
				map.put("three", 3);
				map.put("four", 4);
				map.put("one", 5);
			
				map.putIfAbsent("two",  5);
				System.out.println(map);
				System.out.println(map.containsValue(4));
				Set<Entry<String, Integer>> entries=map.entrySet();
				for(Entry<String ,Integer> entry:entries)
				{
					entry.setValue(entry.getValue()*10);
				}
				System.out.println(map);
				map.replace("one",50,33);
				System.out.println(map);
		}
}
