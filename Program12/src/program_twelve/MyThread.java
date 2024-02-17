package program_twelve;

public class MyThread extends Thread {
	 
	    MyThread() {
	        super(); // calling base class constructor
	        start(); // starting the thread
	    }

	    public void run() {
	        // The code inside this method will be executed by the thread
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Child Thread: " + i);
	            try {
	                Thread.sleep(1000);
	            } 
	            catch (InterruptedException e) {
	                System.out.println(e);
	            }
	        }
	    }
}
	    
/*In this program:

The MyThread class extends Thread class, making it a thread class.
In the constructor of MyThread, super() is used to call the constructor 
of the base class Thread, and then start() is invoked to start the thread.
The run() method overrides the run() method of the Thread class. 
The code inside this method will be executed by the child thread.
In the main method, an instance of MyThread is created, which starts a child thread, 
and the main thread continues to execute concurrently with the child thread. */	

	