package test;

public class Daemon_Thread extends Thread{

	public void run() {
		
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon thread is running!");
		}
		else {
			System.out.println("User thread is running");
		}
	}
	
	
	public static void main(String[] args) {
		
		Daemon_Thread t1 = new Daemon_Thread();
		t1.setDaemon(true);
		
		t1.start();
		

	}

}
