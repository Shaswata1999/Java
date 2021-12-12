// Child thread will execute after main thread
public class Join_Method_2 extends Thread
{

	static Thread mainThread;
	public void run()
	{
		 try
		 {
			 mainThread.join();
			 for(int i=1; i<=5; i++)
			 {
				 System.out.println("Thread 0 : "+i);
				 Thread.sleep(1000);
			 }
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mainThread = Thread.currentThread();
		Join_Method_2 jm1 = new Join_Method_2();
		jm1.start();
		
		 try
		 {
			 for(int i=1; i<=5; i++)
			 {
				 System.out.println("Main Thread : "+i);
				 Thread.sleep(2000);
			 }
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	}
}