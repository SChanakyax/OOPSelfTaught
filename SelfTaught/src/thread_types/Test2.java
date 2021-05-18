package thread_types;

class Test2 implements Runnable{
	
	public void run() {
		System.out.println("Thread is running....");
	}

	public static void main(String[] args) {
		Test2 ob1 = new Test2();
		Thread t2 = new Thread(ob1);
		t2.start();
	}
}
