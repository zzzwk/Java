package advancedThread;
/*
 * synchronized(引用类型) {语句块 }: 若引用类型的对象所是打开的，则运行并上锁
 */

public class ThreadSynchronizedDemo02 extends Thread{
	
	public static int data = 0;
	public int tid,add;
	public boolean flag;
	
	public ThreadSynchronizedDemo02(int tid, int add) {
		this.tid = tid;
		this.add = add;
		flag = false;
	}
	
	public void run(){
		try {
			synchronized (Class.forName("advancedThread.ThreadSynchronizedDemo02")) {
				System.out.println("Thread: " + tid + 
						" enter in synchronized block,data = " + data);
				data += add;
				System.out.println("Thread: " + tid + 
						" leave synchronized block,data = " + data +
						" increasement : " + add);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		flag = true;
	}

	public static void main(String[] args) {
		ThreadSynchronizedDemo02 t1 = new ThreadSynchronizedDemo02(1, 20);
		ThreadSynchronizedDemo02 t2 = new ThreadSynchronizedDemo02(2, 40);
		t1.start();
		t2.start();
		while (!t1.flag || !t2.flag) ;
		System.out.println("result: data = " + ThreadSynchronizedDemo02.data);
	}

}
