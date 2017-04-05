package advancedThread;

/**
 * 线程组：线程和线程组的集合
 * getThreadGroup():获取当前线程所在的线程组
 * enumerate():将该线程组以及以下各级线程组的 线程 拷贝到数组中
 */

public class ThreadGroupDemo {
	
	public static void main(String[] args) {
		
		ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
		while(threadGroup != null){
			int n = threadGroup.activeCount();
			System.out.println("ThreadGroup " + threadGroup.getName() +
					" has " + n + " Thread(s)");
			Thread[] tList=new Thread[n];
			int m = threadGroup.enumerate(tList);
			for (int i = 1; i <= m; i++) {
				System.out.println("NO." + i + " Thread is " + 
						tList[i-1].getName());
			}
			threadGroup = threadGroup.getParent();
		}
	}

}
