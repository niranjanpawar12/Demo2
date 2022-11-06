package com.velocity;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo2 {
public static void main( String[]args) {
	LinkedList<Integer>primeNumber=new LinkedList<Integer>();
	primeNumber.add(2);
	primeNumber.add(4);
	primeNumber.add(6);
	primeNumber.add(8);
	primeNumber.add(3);
	Iterator<Integer>itr=primeNumber.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());}
		for(Integer num: primeNumber) {
			System.out.println(num);
		}
	}
}


