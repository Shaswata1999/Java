
public class InterruptThread extends Thread
{

	public void run()
	{
		 try
		 {
			 for(int i=1; i<=5; i++)
			 {
				 System.out.println("Thread 0 "+i);
				 Thread.sleep(3000);
			 }
		 }
		 catch(Exception e)
		 {
			 System.out.println("Interrupt Exception : "+e);
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterruptThread it = new InterruptThread();
		it.start();
		it.interrupt();
	}

}
