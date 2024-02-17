package program_twelve;

public class Demo {

	public static void main(String[] args) {
					  new MyThread(); // creating an instance of MyThread
			        // The code inside this method will be executed by the main thread
			        for (int i = 1; i <= 5; i++) {
			            System.out.println("Main Thread: " + i);
			            try {
			                Thread.sleep(1000);
			            } catch (InterruptedException e) {
			                System.out.println(e);
			            }
			        }
			    }
			


	}


