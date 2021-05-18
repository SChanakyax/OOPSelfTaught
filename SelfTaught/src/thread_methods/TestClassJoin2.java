package thread_methods;

//THREAD JOIN(LONG MILISECOND) METHOD

public class TestClassJoin2 extends Thread{

	public void run() {
		for(int x=0; x<5; x++) {
			System.out.println(Thread.currentThread().getId() + " " + x+1);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
	
		TestClassJoin2 t1 = new TestClassJoin2();
		TestClassJoin2 t2 = new TestClassJoin2();
		TestClassJoin2 t3 = new TestClassJoin2();
		
		t1.start();
		
		try {
			t1.join(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
		t3.start();

	}

}
