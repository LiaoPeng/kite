package com.galaxy.kite.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsLearn {
	
	public void executorsFactory(){
		
		Runnable thread = new Runnable() {			
			@Override
			public void run() {
			}
		};
		
		ExecutorService cachedPool = Executors.newCachedThreadPool();
		ExecutorService fixedPool = Executors.newFixedThreadPool(0);
		fixedPool.execute(thread);
		fixedPool.submit(thread);
		
	}

}
