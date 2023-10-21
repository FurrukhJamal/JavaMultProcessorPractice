package appendixCodes;

public class firstExample {
	public static void main(String[] args) {
		Thread[] thread = new Thread[8];
		for(int i = 0; i < thread.length; i++) {
			final String message = "hello world from thread " + i;
			thread[i] = new Thread(new Runnable() {
				public void run() {
					System.out.println(message);
				}
			});
			
		}
		for (int i = 0; i < thread.length ; i++ ) {
			thread[i].start();
		}
		
		try {
			for (int i = 0; i < thread.length ; i++ ) {
				thread[i].join();
			}
		}
		catch (Exception e){
			System.out.println("exception");
		}
		
		
		
		
	}

}
