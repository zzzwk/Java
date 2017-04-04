package advancedThread;

public class ThreadDemoTest {
	
	public static void main(String[] args) throws Exception {
		ThreadDemo threadDemo = new ThreadDemo();
		Thread thread = new Thread(threadDemo,"A");
		
//		isAlive() 方法
//		System.out.println("Thread Started? " + thread.isAlive());
//		thread.start();
//		System.out.println("Thread Started? " + thread.isAlive());
//		Thread.sleep(1000);
//		System.out.println("Thread Started? " + thread.isAlive());
		
		
//		join() 方法
//		for (int i = 0; i < 20; i++) {
//			System.out.println("main Thread : " + i);
//			if (i == 10) {
//				thread.start();
//				thread.join();
//			}
//		}
		
	}

}
