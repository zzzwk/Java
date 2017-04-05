package advancedThread;

/*
 * Class forName():返回类对象的引用。一个类的静态成员域和静态成员方法属于类对象，
 * 				      非静态属于实例对象
 * wait(),wait(long timeout),wait(long timeout, int nanos)
 * notify(),notifyAll()
 */

class Experiment {
	public synchronized void method1(int tid) throws InterruptedException{
		System.out.println("Thread " + tid + " is running method1");
		Thread.sleep(1000);
		System.out.println("Thread " + tid + " finish method1");
	}
	
	public void method2(int tid) throws InterruptedException{
		System.out.println("Thread " + tid + " is running method2");
		Thread.sleep(1000);
		System.out.println("Thread " + tid + " finish method2");
	}
}

public class ThreadSynchronizedDemo01 extends Thread{
	
	private Experiment experiment;
	private int tid;
	
	public ThreadSynchronizedDemo01(Experiment experiment, int tid) {
		this.experiment = experiment;
		this.tid = tid;
	}
	
	public void run() {
		try {
			System.out.println("Start Thread " + tid);
			experiment.method1(tid);
			experiment.method2(tid);
			System.out.println("Finish Thread " + tid);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Experiment experiment = new Experiment();
		ThreadSynchronizedDemo01 t1 = new ThreadSynchronizedDemo01(experiment, 0);
		ThreadSynchronizedDemo01 t2 = new ThreadSynchronizedDemo01(experiment, 1);
		t1.start();
		t2.start();
	}

}
