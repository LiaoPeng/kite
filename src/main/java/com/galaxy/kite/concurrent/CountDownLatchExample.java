package com.galaxy.kite.concurrent;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
	public static class Runner implements Runnable{
		private CountDownLatch countLatch;
		private Thread thread;
		public Runner(CountDownLatch countLatch,String name){
			this.countLatch = countLatch;
			thread = new Thread(this,name);
			thread.start();
		}
		@Override
		public void run() {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {}
			System.out.println(String.format("Name:%s had reached the starting point.",thread.getName()));
			countLatch.countDown();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		int numOfRunner = 10;
		CountDownLatch countLatch = new CountDownLatch(numOfRunner);
		for(int i=0; i< numOfRunner;i++)
			new Runner(countLatch, "Runner num " + i);
		countLatch.await();
		System.err.println("Begin the game.");
	}
}
