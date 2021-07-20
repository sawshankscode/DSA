package com.shawshank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterface {
																		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List values=new ArrayList();
		values.add(4);
		values.add(9);	//here 6 is not int but Integer i.e Object
		values.add(6);
		values.sort(null);
		Collections.reverse(values);
		for(Object o:values)
			System.out.println(o);
		
		
	}

}
