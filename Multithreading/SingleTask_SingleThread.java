
public class SingleTask_SingleThread extends Thread
{

	public void run()
	{
		System.out.print("Sigle thread Performing Single Task");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingleTask_SingleThread t = new SingleTask_SingleThread();
		t.start();
	}

}
