
public class Priority_Check extends Thread
{

	public void run()
	{
		System.out.println("Chaild Thread");
		System.out.println("Child Thread Priority "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main Thread default priority: "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("Main Thread new priority: "+Thread.currentThread().getPriority());
		
		Pririty_Check pc = new Pririty_Check();
		pc.setPriority(NORM_PRIORITY);
		pc.start();
	}

}
