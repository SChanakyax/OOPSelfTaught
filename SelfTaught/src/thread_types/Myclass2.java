package thread_types;

//USING RUNNABLE INTERFACE

public class Myclass2 implements Runnable{

	public void run() {
		System.out.println("Thread running (runnable interface)....");
	}
	
	public static void main(String[] args) {
		
		Myclass2 ob = new Myclass2();
		Thread t1 = new Thread(ob);
		t1.start();
	}

}
