package runtime;

//available processors
public class Runtime2 {

	public static void main(String[] args)throws Exception {
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println(Runtime.getRuntime().maxMemory());
		System.out.println(Runtime.getRuntime().freeMemory());
	}

}
