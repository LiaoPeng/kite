package com.galaxy.kite.concurrent;

import java.security.InvalidParameterException;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Runner implements Runnable {

	private CyclicBarrier barrier;
	private int gatherPoint;
	private int wholeLength;
	private Thread thread;

	public Runner(CyclicBarrier barrier, int gatherPoint, int wholeLength,
			String name) {
		this.barrier = barrier;
		if (gatherPoint > wholeLength) {
			throw new InvalidParameterException();
		}
		this.gatherPoint = gatherPoint;
		this.wholeLength = wholeLength;
		thread = new Thread(this, name);
		thread.start();

	}

	@Override
	public void run() {

		for (int i = 0; i < wholeLength; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println("Now the distance is:" + i + "@"
					+ thread.getName());
			if (gatherPoint == i) {
				System.out.println(String.format(
						"I had reached the gather point %s,I wait the partner",
						gatherPoint));
				try {
					barrier.await();
				} catch (InterruptedException | BrokenBarrierException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("I had finished the Game.");
	}
}

public class SecretRunning {

	public static void main(String[] args) {

		CyclicBarrier barrier = new CyclicBarrier(2, new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Cyclic barrier is begin run," + i);
				}

			}
		});
		Runner runner1 = new Runner(barrier, 5, 20, "James");
		Runner runner2 = new Runner(barrier, 10, 20, "Kobe");

	}

}
