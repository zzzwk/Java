package simpleThread;
/*
 * 从线程继承方式
 * run()方法中属于那些会与程序中的其他线程“并发”或“同时”执行的代码
 * 
 * 启动线程时，直接调用类的start方法
 */
public class SimpleThread extends Thread{
	private int countDown;
	private int threadNumber;
	private static int threadCount = 1;
	
	public SimpleThread(){
		countDown=5;
		threadNumber = threadCount ++;
		System.out.println("Making Thread " + threadNumber);
	}
	
	public void run(){
		while (countDown>0){
			System.out.println("Thread " + threadNumber + 
					"decrease to " + countDown);
			countDown --;
		}
	}

}
