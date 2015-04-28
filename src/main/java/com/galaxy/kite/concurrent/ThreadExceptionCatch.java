package com.galaxy.kite.concurrent;

import java.util.concurrent.ThreadFactory;

class MyUncatchExceptionHandler implements Thread.UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println(String.format("Thread name:%s;Cause exception:%s",
				t.getName(), e.getCause()));
	}
}

class HandlerThreadFactory implements ThreadFactory {

	@Override
	public Thread newThread(Runnable r) {

		Thread t = new Thread(r);
		t.setUncaughtExceptionHandler(new MyUncatchExceptionHandler());
		return t;
	}

}

public class ThreadExceptionCatch {

	public void setDefaultExceptionHandler() {
		Thread.setDefaultUncaughtExceptionHandler(new MyUncatchExceptionHandler());
	}

	public static void main(String[] args) {
		
		Thread thread = new Thread( new Runnable() {	
			@Override
			public void run() {
				throw new RuntimeException("Please handle this exceptiom");
			}
		});
	
		thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.err.println(String.format("Thread name:%s;Cause exception:%s",
						t.getName(), e.getMessage()));
			}});		
		thread.start();
	}
}
