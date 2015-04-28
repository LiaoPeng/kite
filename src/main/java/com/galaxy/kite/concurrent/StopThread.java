package com.galaxy.kite.concurrent;

public class StopThread {
	
	private static boolean stopRequested; 
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				int i = 0;
				while(!stopRequested){
					i++;
				}
			}
		});
		thread.start();
		thread.sleep(1000);
		stopRequested = true;
		
	}
	
	

}
