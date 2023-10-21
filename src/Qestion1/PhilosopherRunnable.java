package Qestion1;

public class PhilosopherRunnable implements Runnable{
	private Philosopher philosopher;
	
	public PhilosopherRunnable(Philosopher philosopher) {
		this.philosopher = philosopher;
	}
	
	public void run() {
		this.philosopher.philosophersLifeStart();
	}
}
