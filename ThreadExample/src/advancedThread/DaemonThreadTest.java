package advancedThread;


import org.junit.Test;

public class DaemonThreadTest {

	@Test
	public void test() {
		DaemonThread demo01 = new DaemonThread();
		demo01.setDaemon(true);
		demo01.start();
		if (demo01.isDaemon()) 
			System.out.println("Created a Daemon Thread");
		else System.out.println("Created a User Thread");
		System.out.println("main method finished");
	}

}
