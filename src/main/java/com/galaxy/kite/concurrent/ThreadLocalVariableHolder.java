package com.galaxy.kite.concurrent;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadLocalVariableHolder {
	private static ThreadLocal<Integer> valueLocal = new ThreadLocal<Integer>() {
		private Random random = new Random(47);
		protected synchronized Integer initialValue() {
			return random.nextInt(10000);
		}
	};

	public static void increment() {
		valueLocal.set(valueLocal.get() - 1);
	}

	public static int get() {
		return valueLocal.get();
	}

	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i=0; i< 5; i++){
			exec.execute(new Accessor(i));
		}
	
		exec.shutdown();
		if(!exec.awaitTermination(1, TimeUnit.MICROSECONDS)){
			System.out.println("Some task were not interrupted");
		}
		System.out.println("Reached here");
		exec.shutdownNow();
		
	}
}

class Accessor implements Runnable {
	
	private int idn;
	
	public Accessor(int idn) {
		this.idn = idn;
	}

	@Override
	public void run() {
		while (!Thread.currentThread().isInterrupted()) {
			ThreadLocalVariableHolder.increment();
			System.out.println("this" + this);
			Thread.yield();
		}
		System.out.println("Exit the thread.");
	}
	
	public String toString(){
		return String.format("# %s :%s ", idn,ThreadLocalVariableHolder.get());
	}
}
