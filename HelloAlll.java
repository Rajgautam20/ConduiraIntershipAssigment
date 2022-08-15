// Q.1 :- create 5 Thread using Thread Class and print "Hello All".

class MyThread extends Thread {
    
    public void run(){
            System.out.println("Hello All");
        }
}

public class Main
{
	public static void main(String[] args) {
	    //creating 5 thread 
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		MyThread t4 = new MyThread();
		MyThread t5 = new MyThread();
		
		//starting 5 Thread
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
