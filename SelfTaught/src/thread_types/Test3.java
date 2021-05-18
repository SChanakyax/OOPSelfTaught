package thread_types;

class Institute{

	public void classroom(String clsname) {
		System.out.println(clsname);
		
	}
	
}

class Mythread extends Thread{
	Institute ins;
	String clsname;
	
	public Mythread(Institute ins,String clsname) {//constructor
		this.clsname = clsname;
		this.ins = ins;
	}
	
	public void run() {
		ins.classroom(clsname);
	}
}

public class Test3 {	
	public static void main(String[] args) {

		Institute i1 = new Institute();
		Mythread t1 = new Mythread(i1,"k9");
		
		t1.start();
	}
}
