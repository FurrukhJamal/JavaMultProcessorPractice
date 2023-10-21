package chapter1Practice;

public class MyRunnable implements Runnable {
	public void run() {
		this.go();
	}
	
	public void go() {
		doMore();
	}
	
	public void doMore() {
		System.out.println(Thread.currentThread().getName() + " on top");
		Thread.dumpStack();		
	}
}


