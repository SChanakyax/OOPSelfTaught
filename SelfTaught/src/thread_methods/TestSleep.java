package thread_methods;

public class TestSleep extends Thread{

	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getId() + "  _" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		TestSleep t1 = new TestSleep();	
		TestSleep t2 = new TestSleep();
		
		t1.start();
		t2.start();
	//	t2.start(); cant start a thread twice ....
		
	}
}
