package advancedThread;

/*
 * 后台线程 Daemon Thread
 * 在一个程序中只有后台线程在运行时，程序会立即退出
 */

public class DaemonThread extends Thread{
	
	public void run() {
		while (true) {
			System.out.println("Daemon Thread is Running");
			try {
				Thread.sleep((long) (Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
