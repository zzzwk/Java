package advancedThread;

/*
 * 线程的常用方法
 * currentThread() : 返回当前线程对象
 * getName() : 返回线程名字
 * isAlive() : 判断线程是否在启动
 * join() : 强行让线程执行
 */

public class ThreadDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("Current Thread's name :" + Thread.currentThread().getName());
		System.out.println("Thread is Running");
	}

	
	
}
