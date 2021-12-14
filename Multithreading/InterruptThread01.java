
public class InterruptThread01 extends Thread
{

	public void run()
	{
		System.out.println(Thread.interrupted());
		System.out.println(Thread.interrupted());	// for twice using interrupt status is become false
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Thread Exception : "+e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterruptThread01 it =new InterruptThread01();
		it.start();
		it.interrupt();
	}

}
