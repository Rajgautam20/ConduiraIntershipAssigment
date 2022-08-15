// Q.1 :- create 5 Thread using Runnable and print "Hello India"
public class Main
{
	public static void main(String[] args) {
	    
	    //Runnable interface using lambda 
		
	    Runnable r1 = ()->{
	        //this is body of Thread
	        System.out.println("Hello India");
	    };
	    
	    //creating 5 thraed here 
		
	    Thread t1 = new Thread(r1);
	    Thread t2 = new Thread(r1);
	    Thread t3 = new Thread(r1);
	    Thread t4 = new Thread(r1);
	    Thread t5 = new Thread(r1);
	    
	    //starting my 5 thread
		
	    t1.start();
	    t2.start();
	    t3.start();
	    t4.start();
	    t5.start();
	}
}