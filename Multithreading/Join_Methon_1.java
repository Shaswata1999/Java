// 1st Child Thread will execute then the mail thread will be execute
public class Join_Methon_1 extends Thread
{

	public void run()
	{
		 try
		 {
			 for(int i=0; i<=5; i++)
			 {
				 System.out.println("Thread 0 "+i);
				 Thread.sleep(3000);
			 }
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Join_Methon_1 jm = new Join_Methon_1();
		jm.start();
		
		jm.join();
		 try
		 {
			 for(int i=0; i<=5; i++)
			 {
				 System.out.println("Main Thread "+i);
				 Thread.sleep(3000);
			 }
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	}

}
