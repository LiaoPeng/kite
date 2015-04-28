package com.galaxy.kite.concurrent;

public class SynchronizedObjcet {

	static Integer count = 0;

	static class UpdateObjcet implements Runnable {
		public synchronized void run() {
			try {
				synchronized (SynchronizedObjcet.class) {
					System.out.println("Lock Synchronized count");
					Thread.sleep(500);
					SynchronizedObjcet.count += 1000;
					System.out.println(String.format("Thread@%s",SynchronizedObjcet.count));
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		}
	}

	public static void main(String[] args) throws InterruptedException {

		new Thread(new SynchronizedObjcet.UpdateObjcet()).start();
		new Thread(new SynchronizedObjcet.UpdateObjcet()).start();
		new Thread(new SynchronizedObjcet.UpdateObjcet()).start();

		Thread.sleep(100);
		synchronized (SynchronizedObjcet.count) {
			for (int i = 0; i < 10; i++) {
				SynchronizedObjcet.count++;
				System.out.println(SynchronizedObjcet.count);
			}
		}

	}
}
