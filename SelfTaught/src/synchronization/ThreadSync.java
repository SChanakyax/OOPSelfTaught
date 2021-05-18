package synchronization;

class Table{
	
	synchronized void printTable(int n) {
		for(int x=1; x<=5; x++) {
			System.out.println(n*x);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class Mythread1 extends Thread{
Table t;	

	Mythread1(Table t){
		this.t = t;
	}
	
	public void run() {
		t.printTable(5);
	}
}

class Mythread2 extends Thread{
Table t;	
	
	Mythread2(Table t){
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}


public class ThreadSync {

	public static void main(String[] args) {
	
		Table obj = new Table();
		Mythread1 t1 = new Mythread1(obj);
		Mythread2 t2 = new Mythread2(obj);
		
		
		t1.start();
		t2.start();
	}

}
