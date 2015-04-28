package com.galaxy.kite.tutorial.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ConcurrentTask {

	public void concurrentExecutor() throws InterruptedException, ExecutionException{
		
		ExecutorService service = Executors.newSingleThreadScheduledExecutor();
		
		Callable<Object> task = new Callable<Object>() {
			@Override
			public Object call() throws Exception {
				System.out.println("Callable");
				return "Task";
			}
		};	
		
		Runnable runTask = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Runable");
			}
		};
		
		Future<Object> future = service.submit(task);
		service.submit(runTask);
		Object object = future.get();
		System.err.println(object);
		
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		new ConcurrentTask().concurrentExecutor();
		
		
	}
}
