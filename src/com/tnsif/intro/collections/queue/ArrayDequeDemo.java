package com.tnsif.intro.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeDemo {
	 public static void main(String[] args) {

	        Queue<String> q = new ArrayDeque<>();

	        q.offer("A");
	        q.offer("B");
	        q.offer("C");

	        System.out.println(q);      

	        q.poll();
	        System.out.println(q);      
	    }
}
