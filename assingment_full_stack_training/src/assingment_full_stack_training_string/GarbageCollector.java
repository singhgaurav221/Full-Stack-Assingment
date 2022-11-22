package assingment_full_stack_training_string;

public class GarbageCollector {
	
	static String str;

	public  GarbageCollector(String s) {
	    super();
	    this.str = s;
	}
	@Override
	protected void finalize() throws Throwable {
	    // TODO Auto-generated method stub
	    super.finalize();
	    System.out.println("Garbage Clean");
	}
	@Override
	public String toString() {
	    return "Garbage [s=" + str + "]";
	}
	public static void main(String[] args) {
	     GarbageCollector g= new GarbageCollector("Gaurav kumar singh");
	     g=null;
	 //   System.out.println(g);
	     System.gc();
	     
	     
	}

}
