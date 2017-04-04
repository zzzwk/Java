package simpleThread;

import org.junit.Test;

public class SimpleThread_RunnableTest {

	@Test
	public void test() {
		SimpleThread_Runnable r1 = new SimpleThread_Runnable("A");
		SimpleThread_Runnable r2 = new SimpleThread_Runnable("B");
		r1.start();
		r2.start();
	}

}
