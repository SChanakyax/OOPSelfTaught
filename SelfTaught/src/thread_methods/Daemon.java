package thread_methods;

public class Daemon extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) { //Checking for daemon
		System.out.println("Daemon thread works");
		System.out.println("Thread Name " + Thread.currentThread().getName());
		System.out.println();
		}
		else {
			System.out.println("User thread works");
		}
	}

	public static void main(String[] args) {
	
	Daemon t1 = new Daemon();//Thread created
	Daemon t2 = new Daemon();
	Daemon t3 = new Daemon();
		
	t1.setDaemon(true);//Make daemon
	
	t1.start();//daemon start
	t2.start();
	t3.start();
	
	}
}
