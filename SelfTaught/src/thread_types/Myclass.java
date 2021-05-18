package thread_types;

//EXTENDING THREAD CLASS ---

public class Myclass extends Thread{

	public void run() {		
		System.out.println("Thread is running.....");		
	}
	
	public static void main(String[] args) {	
		Myclass t1 = new Myclass();
		t1.start();
	}

}
