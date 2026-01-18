package com.tnsif.intro.multithreading.runnable;

public class ThreadMain {

	public static void main(String[] args) {
		Thread t=new Thread(new ThreadDemo());
		t.start();
		
		for(int i=1;i<11;i++) {
			System.out.println(Thread.currentThread()+"---->"+Thread.currentThread().getName());
		}
	}

}
