package com.galaxy.kite.algorithm.concurrent;

import java.io.IOException;

import org.junit.Test;

import com.galaxy.kite.concurrent.InterruptThread;

public class InterruptThreadTest {

	@Test
	public void testCatchInterrupt() throws InterruptedException, IOException {

		InterruptThread interruptThread = new InterruptThread();
		interruptThread.thread.start();

		interruptThread.thread.interrupt();
	}

	@Test
	public void testThreadJoin() throws InterruptedException, IOException {

		InterruptThread interruptThread = new InterruptThread();
		interruptThread.thread.start();

		interruptThread.thread.join();
		System.out.println("It will be after:thread finished.");

	}
}
