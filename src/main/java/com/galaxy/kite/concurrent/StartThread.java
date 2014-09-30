package com.galaxy.kite.concurrent;

public class StartThread {
	
	private final String THREAD_NAME = "count no";
	private int count =0;
	
	Thread countThread = new Thread(THREAD_NAME){
		
		@Override
		public void run(){
			System.out.println(count++);
		}
	};
	
	
	Thread implementRunnable = new Thread( new Runnable() {
		
		@Override
		public void run() {
			
			
		}
	});

	
}
