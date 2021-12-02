
public class SinglrTask_MultipleThread extends Thread
{

	public void run()
	{
		System.out.println("Multiple Thread Prforming single Task");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SinglrTask_MultipleThread t1 = new SinglrTask_MultipleThread();
		t1.start();
		
		SinglrTask_MultipleThread t2 = new SinglrTask_MultipleThread();
		t2.start();
	}

}
