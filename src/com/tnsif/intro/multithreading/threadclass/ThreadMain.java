package com.tnsif.intro.multithreading.threadclass;

public class ThreadMain {

	public static void main(String[] args) {
		ThreadDemo t=new ThreadDemo();
		t.start();
		System.out.println(t.isAlive());
		for(int i=1;i<11;i++) {
			System.out.println(Thread.currentThread()+"----->"+Thread.currentThread().getName());
		}
	}
}
