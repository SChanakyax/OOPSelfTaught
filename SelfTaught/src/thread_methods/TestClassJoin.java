package thread_methods;

public class TestClassJoin extends Thread{

	public void run() {
		for(int x=0; x<5; x++) {
			System.out.println(x+1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
		
	public static void main(String[] args) {
		
		TestClassJoin t1 = new TestClassJoin();
		TestClassJoin t2 = new TestClassJoin();
		TestClassJoin t3 = new TestClassJoin();
		
		t1.start();
		try {
			t1.join();	//execute entire thread and go to others
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		t2.start();
		t3.start();		
	}
}
