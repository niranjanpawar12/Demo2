package com.velocity;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
public static void main (String[]args) {
	ArrayList<String>namelist=new	ArrayList<String>();
	namelist.add("pavan");
	namelist.add("rohit");
	namelist.add("priya");
	namelist.add("niru");
	Iterator<String>itr=namelist.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}



