package Qestion1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThread {
	public static void main(String[] args) {
		ExecutorService threadpool = Executors.newFixedThreadPool(5);
		List<PhilosopherRunnable> myrunnables = new ArrayList<PhilosopherRunnable>();
		
		List<Fork> forks = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			forks.add(new Fork(i));
		}
		
		for(int i = 1; i <= 5; i++) {
			
			myrunnables.add(new PhilosopherRunnable(new Philosopher(i, forks)));
		}
		for(int i = 0; i < 5; i++) {
			threadpool.execute(myrunnables.get(i));
		}
		threadpool.shutdown();
		
	}
}
