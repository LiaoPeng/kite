package com.galaxy.kite.concurrent;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedCode {

	private static List<String> strList = new ArrayList<String>();

	static class TestSynchronizedCode implements Runnable {

		private List<String> strList;

		TestSynchronizedCode(List<String> strList) {
			this.strList = strList;
		}

		@Override
		public void run() {
			synchronized (strList) {
				System.out.println("Lock the strlist");
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					System.out.println("Interruput the synchronized code");
				}
			}
			System.out.println("Over the lock");
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Thread thread = new Thread(new TestSynchronizedCode(strList));
		thread.start();

		synchronized (strList) {
			System.out.println("Get the lock");
			strList.add("aaa");
			strList.add("aaa");
			strList.add("aaa");
			strList.add("aaa");
			for (String str : strList) {
				System.out.println(str);
			}


		}
		

		

	}

}
