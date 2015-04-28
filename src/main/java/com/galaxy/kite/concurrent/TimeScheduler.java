package com.galaxy.kite.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class TimeScheduler {
	
	public void schedulerTask(){
		
		int corePoolSize = 12;
		ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(corePoolSize);
		Runnable runnable = new Runnable(){
			@Override
			public void run() {
				
			}
		};
		Callable<String> callable = new Callable<String>() {

			@Override
			public String call() throws Exception {
				
				return null;
			}
		};
		ScheduledFuture<?> future1 = scheduled.schedule(runnable, 1000, TimeUnit.MILLISECONDS);
		ScheduledFuture<String> future2 = scheduled.schedule(callable, 1000, TimeUnit.MILLISECONDS);
	
	}

}
