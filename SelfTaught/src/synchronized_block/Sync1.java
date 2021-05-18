package synchronized_block;

class Table{
	public void printTable(int n){
		synchronized(this) {
		for(int x=1; x<=5; x++) {
			System.out.println(n*x);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}//sync
	}
}

public class Sync1 {

	public static void main(String[] args) {
		
		final Table obj = new Table();
		Thread t1 = new Thread() {
			public void run() {
				obj.printTable(10);
			}
		};		
		
		Thread t2 = new Thread() {
			public void run() {
				obj.printTable(100);
			}
		};
		
		t1.start();
		t2.start();
	}

}
