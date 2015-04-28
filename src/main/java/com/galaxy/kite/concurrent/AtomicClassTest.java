package com.galaxy.kite.concurrent;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicClassTest implements Runnable {
	
	private AtomicInteger i = new AtomicInteger(0);
	
	public int getValue(){ return i.get();}
	
	private void enenIncreament(){
		i.addAndGet(2);
	}
	

	@Override
	public void run() {
		while (true){
			enenIncreament();
		}
	}
	
	public static void main(String args[]){
		
		new Timer().schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.err.println("Aborting");
				System.exit(0);
			}
		}, 5000);
		
		Future future = null;
		future.cancel(false);
		
		ExecutorService service = Executors.newCachedThreadPool();
		AtomicClassTest atomicClassTest = new AtomicClassTest();
		service.execute(atomicClassTest);
		while(true){
			
			int val = atomicClassTest.getValue();
			if(val%2 != 0){
				System.out.println(val);
				System.exit(0);
			}
		}
	}
}
