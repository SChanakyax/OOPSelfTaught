package thread_types;

public class Test extends Thread{

	public void run() {
		System.out.println("Thread running...");
	}
	
	public static void main(String[] args) {
	
		Test t1 = new Test();
		t1.start();
	}

}




