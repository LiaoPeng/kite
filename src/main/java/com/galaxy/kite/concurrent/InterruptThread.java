package com.galaxy.kite.concurrent;

public class InterruptThread {

	public Thread thread = new Thread("Interrupt thread") {
		private int runTimes = 0;

		@Override
		public void run() {

			try {
				Thread.sleep(5000);
				System.out.println("Finish sleep.");
			} catch (InterruptedException e) {
				System.out.println("Catch a interruption exception.");
			}
			
			System.out.println("Finish run method.");

		}

		private void doSomething() {
			runTimes++;
			System.out.println(runTimes);
		}
	};

}
