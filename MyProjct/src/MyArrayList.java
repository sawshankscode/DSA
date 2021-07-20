import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {
	
//	functions of List
//	add();
//	set();
//	remove();
//	removeAll();
//	contains();
//	clear();
//	addAll();
//	toArray();
	public static void main(String[] args) {
		List fruits =new ArrayList();
		List vegetables =new LinkedList();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Guava");
		fruits.add(1);
		fruits.add("Banana");
		fruits.add("Watermelon");
		vegetables.add("tomato");
		vegetables.add("potato");
		vegetables.add("capsicum");
//		fruits.addAll(vegetables);
//		fruits.set(1, "Mango");
		System.out.println(vegetables.size());
		}
//		Pair<String,Integer> p1=new Pair<>("randi",1);
//		p1.print();
		
	}


