
public class CreateWithThreadClass extends Thread
{
	
	public void run()
	{
		System.out.print("Create With Thread Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreateWithThreadClass t = new CreateWithThreadClass();
		t.start();
	}

}
