//In the above program, we are creating a fixed-size thread pool of 5 runnable threads. Then we are submitting 10 jobs to this pool, since the pool size is 5, it will start working on 5 jobs and other jobs will be in wait state, as soon as one of the job is finished, another job from the wait queue will be picked up by runnable thread and get’s executed. Here is the output of the above program.


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread implements Runnable {
    
    private String command;
    
    public MyThread(String s){
        this.command=s;
    }
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start. Command = "+command);
        processCommand();
        System.out.println(Thread.currentThread().getName()+" End.");
    }
    
     private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString(){
        return this.command;
    }
    
}
public class Main {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable runnable = new MyThread("" + i);
            executor.execute(runnable);
          }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
}

//The output confirms that there are five threads in the pool named from “pool-1-thread-1” to “pool-1-thread-5” and they are responsible to execute the submitted tasks to the pool.