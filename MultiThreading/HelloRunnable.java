public class HelloRunnable implements Runnable {

	public void run() {
		System.out.println("Hello from a thread!");
	}

	public static void main(String[] args) {
		(new Tread(new HelloRunnable())).start();
	}	
	
}