// Output may be comes different in every execution because thread scheduler may be accept the hint or not
public class Yield_Method extends Thread
{

	public void run()
	{
		for(int i=0;i<=5;i++)
			System.out.println("Thread0 "+i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Yield_Method YM = new Yield_Method();
		YM.start();
		
		Thread.yield();
		for(int i=0; i<=5; i++)
			System.out.println("Main Thread "+i);
	}

}
