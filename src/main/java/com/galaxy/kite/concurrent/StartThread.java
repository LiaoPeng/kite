package com.galaxy.kite.concurrent;

/**
 * There is two way to start a thread
 * 1. implement runnable interface
 * @author palmer.liao
 *
 */
public class StartThread{
	

	
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

	{
		countThread.start();
	}
}
