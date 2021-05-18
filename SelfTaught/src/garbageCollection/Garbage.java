package garbageCollection;

public class Garbage {

	public void finalize() {//called before obj is moved to garbage
		System.out.println("Obj is moved to garbage collection");
	}
	
	public static void main(String[] args) {

		Garbage g1 = new Garbage();
		Garbage g2 = new Garbage();
		
		g1 = null; //un reference an obj >> null
		g2 = null;
		
		System.gc();//call to collect garbage
		
	}

}
