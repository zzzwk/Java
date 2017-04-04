package simpleThread;

/*
 * 实现Runnable接口方式
 * 首先要重写run方法
 * 由于启动线程需要调用start()方法，可以通过实例化Thread类，调用其start()方法实现
 * 
 * 本例中用Thread(Runnable target,String name)这种构造方法
 * 
 */

public class SimpleThread_Runnable implements Runnable{
	
	private Thread thread;
	private String threadName;

	public SimpleThread_Runnable(String threadName) {
		this.threadName = threadName;
		System.out.println("Creating Thread " + threadName);
	}
	
	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println(threadName + ": " + i);
		}
	}
	
	public void start(){
		System.out.println("Starting Thread " + threadName);
		thread = new Thread(this,threadName);
		thread.start();
	}

}
