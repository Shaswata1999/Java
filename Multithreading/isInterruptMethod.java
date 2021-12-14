
public class isInterruptMethod extends Thread
{

	public void run()
	{
		System.out.println(Thread.currentThread().isInterrupted());
		System.out.println(Thread.currentThread().isInterrupted());
		try
		{
			for(int i=1; i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isInterruptMethod itm = new isInterruptMethod();
		itm.start();
		itm.interrupt();
	}

}
