package synchronized_block;

class Tabl{
	public void printTableA(int n) {
		synchronized (this) {
			for(int x=1;x<10;x++) {
			System.out.println(n*x);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
}
	
class MythradA extends Thread{
Tabl t;
	MythradA(Tabl t){
		this.t =t;
	}
	
	public void run() {
		t.printTableA(10);
	}
}

class MythradB extends Thread{
Tabl t;
	MythradB(Tabl t){
		this.t =t;
	}
	
	public void run() {
		t.printTableA(100);
	}
}

public class Sync2 {

	public static void main(String[] args) {
		Tabl objs = new Tabl();
		
		MythradA thread1 = new MythradA(objs);
		MythradB thread2 = new MythradB(objs);
		
		thread1.start();
		thread2.start();
		
	}

}
