
public class ThreadName extends Thread
{
	
	public void run()
	{
		System.out.println("This task is performed by : "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadName TN = new ThreadName();
		//TN.start();
		System.out.println("This task performed by : "+Thread.currentThread().getName());
		
		
		TN.setName("Shaswata");	// Change the name of thread
		TN.start();
	}

}
