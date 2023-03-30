public class ThreadDemo extends Thread {
	
	public void run() {
		System.out.println("Thread : " + 
				Thread.currentThread().getName() + " Entered");
		for(int i = 0; i < 5; i++) {
			System.out.println("I is : " + i);
		}
		System.out.println("Thread : " + 
				Thread.currentThread().getName() + " Exit");
	}

	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo();
		// start will call run internally
		t1.start();
		
		ThreadDemo t2 = new ThreadDemo();
		// start will call run internally
		t2.start();
		System.out.println(Thread.currentThread().getName());
	}

}
