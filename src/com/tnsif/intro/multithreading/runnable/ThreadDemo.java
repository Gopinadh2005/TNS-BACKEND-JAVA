package com.tnsif.intro.multithreading.runnable;

public class ThreadDemo implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<11;i++) {
			System.out.println(Thread.currentThread()+"---->"+Thread.currentThread().getName());
		}
	}

}
