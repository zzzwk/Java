package simpleThread;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleThreadTest {

	@Test
	public void test() {
		for (int i = 0 ; i < 5;i ++)
			new SimpleThread().start();
		System.out.println("All Threads Started");
	}

}
