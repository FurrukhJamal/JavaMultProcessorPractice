package chapter1Practice;


public class ThreadTester {
	public static void main(String[] args) {
		Runnable threadJob = new MyRunnable();
		Thread t = new Thread(threadJob);
		System.out.println(Thread.currentThread().getName() + " on top");
		t.start();
		System.out.println("back in main thread");
		
		Thread.dumpStack();
	}
}
