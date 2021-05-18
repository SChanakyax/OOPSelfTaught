package runtime;

public class Runtime3 {

	public static void main(String[] args)throws Exception {
		
		Runtime r3 = Runtime.getRuntime();

		System.out.println("Total memory : " + r3.totalMemory());
		System.out.println("Free memory  : " + r3.freeMemory());
		System.out.println("Max memory   : " + r3.freeMemory());
		
		for(int x=0; x<1000 ; x++) {
			new Runtime3();
		}
		
		System.out.println("Now Free Memory : " + r3.freeMemory());
		
		System.gc();
		
		System.out.println("After gc() : " + r3.freeMemory());
		
	}

}
