package com.Threads;

public class Thread1 extends Thread {

	
	@Override
	public void run() {
	
		for (int i=0;i<100;i++) {
			
			System.out.println(i+" --"+Thread.currentThread().getName());
		}
		
	}

	
}
