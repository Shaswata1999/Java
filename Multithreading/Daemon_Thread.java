
public class Daemon_Thread extends Thread
{

	public void run()
	{
		if(Thread.currentThread().isDaemon())
			System.out.println("Daemon Thread");
		else
			System.out.println("Child Thread");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main Thred");
		Daemon_Thread dt = new Daemon_Thread();
		dt.setDaemon(true);
		dt.start();
	}

}
