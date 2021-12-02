
public class CreateWithRunnableInterface implements Runnable
{
	public void run()
	{
		System.out.print("Create With Runnable Interface");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreateWithRunnableInterface cri = new CreateWithRunnableInterface();
		Thread th = new Thread(cri);
		th.start();
	}

}
