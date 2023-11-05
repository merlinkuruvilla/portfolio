package portfolio;

public class main {

	private static void increment() {
		for (int i = 0; i <= 20; i++) {
			System.out.println("Thread 1 incremented: " + i);
		}
	}

	private static void decrement() {
		for (int i = 20; i >= 0; i--) {
			System.out.println("Thread 2 decremented: " + i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread() {
			public void run() {
				increment();
			};
		};
		Thread thread2 = new Thread() {
			public void run() {
				decrement();
			}
		};
		System.out.println("Starting thread 1");
		thread1.start();
		System.out.println("Waiting for thread 1 to finish");
		thread1.join();
		
		System.out.println("Starting thread 2");
		thread2.start();
		System.out.println("Waiting for thread 2 to finish");
		thread2.join();

	}

}
