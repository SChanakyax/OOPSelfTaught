package thread_methods;

public class Thread_nameing extends Thread{

	public void run() {
		System.out.println("Running....");
		System.out.println(Thread.currentThread().getId() + " " + currentThread().getName());
	}

	public static void main(String[] args) {
	
		Thread_nameing t1 = new Thread_nameing();
		Thread_nameing t2 = new Thread_nameing();
		
		System.out.println("Name of t1 : "+ t1.getName());
		System.out.println("Name of t2 : "+ t2.getName());
		System.out.println("Thread id thread t1 : " + t1.getId());
		System.out.println("Thread id thread t2 : " + t2.getId());
		
		t1.start();
		t2.start();
		
		t1.setName("SC");
		System.out.println("NEW Name of t1 : "+ t1.getName());
		
		
	}

}
