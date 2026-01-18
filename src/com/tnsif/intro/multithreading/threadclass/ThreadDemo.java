package com.tnsif.intro.multithreading.threadclass;

public class ThreadDemo extends Thread {
	public void run() {
		for(int i=1;i<11;i++) {
			System.out.println(Thread.currentThread()+"--->"+Thread.currentThread().getName());
		}
	}
}
