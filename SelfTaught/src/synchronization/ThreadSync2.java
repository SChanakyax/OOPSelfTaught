package synchronization;

//Thread sync with anonymous class
class TableX{
	synchronized public void printTable(int n) {
		for(int z=1; z<=5; z++) {
			System.out.println(n*z);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class ThreadSync2 {

	public static void main(String[] args) {
	
		final TableX obj1 = new TableX();
		
		Thread t1 = new Thread(){
			public void run() {
				obj1.printTable(10);
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				obj1.printTable(100);
			}
		};
		
		t1.start();
		t2.start();
	}

}
