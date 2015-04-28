package com.galaxy.kite.concurrent;

public class InterruptThread {

	public Thread thread = new Thread("Interrupt thread") {
		private int runTimes = 0;

		@Override
		public void run() {

			try {
				
				while(true){
					System.out.println("Execute Thread");
					if(Thread.interrupted()){
						System.out.println("Thread is interrupt.");
						break;
					}
				}
				System.out.println("Finish sleep.");
			} catch (Exception e) {
				System.out.println("Catch a exception: " + e);
			}
			
			System.out.println("Finish run method.");

		}

		private void doSomething() {
			runTimes++;
			System.out.println(runTimes);
		}
	};

	
}
