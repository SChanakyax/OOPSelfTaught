package synchronization;

class TableA{
	synchronized void printTable(int n) {
		for(int i=1;i<5;i++) {
		System.out.println(n * i);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}
}

class MythreadA extends Thread{
TableA t;

	MythreadA(TableA t){
		this.t = t;
	}
	public void run() {
		t.printTable(5);
	}
}

class MythreadB extends Thread{
TableA t;

	MythreadB(TableA t){
		this.t = t;
	}
	public void run() {
		t.printTable(100);
	}
}



public class TestX {
	public static void main(String[] args) {

		TableA obj = new TableA();
		MythreadA t1 = new MythreadA(obj);
		MythreadB t2 = new MythreadB(obj);
		t1.start();
		t2.start();
	}

}
