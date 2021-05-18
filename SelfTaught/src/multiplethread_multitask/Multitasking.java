package multiplethread_multitask;

//perform single task with multiple threads Using extend method

class Sample1 extends Thread{
	
	public void run() {
		System.out.println("Thread s1");
		for(int x=0; x<10; x++) {
			System.out.println(x);
		}
		
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		};
		
	}
}

class Sample2 extends Thread{
	
	public void run() {
		System.out.println("Thread s2");
		for(int x=0; x<10; x++) {
			System.out.println("Thread2>>>" + x);
		}
	}

}


public class Multitasking {

	public static void main(String[] args) {

		Sample1 t1 = new Sample1();
		Sample2 t2 = new Sample2();
		Sample1 t3 = new Sample1();
		Sample1 t4 = new Sample1();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
