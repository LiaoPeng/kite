package com.galaxy.kite.concurrent;

public class InterruptThread {

	Thread thread = new Thread("Interrupt thread") {
		private int runTimes = 0;

		@Override
		public void run() {
			while (true) {
				doSomething();
				try {
					Thread.sleep(100);
					throw new InterruptedException();
				} catch (InterruptedException e) {
					if (Thread.interrupted()) {
						break;
					}
				}
				if (Thread.interrupted()) {
					break;
				}
			}
		}

		private void doSomething() {
			runTimes++;
			System.out.println(runTimes);
		}
	};

	public static void main(String[] args) {
		new InterruptThread().thread.start();
	}

}
