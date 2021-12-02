class Test1 extends Thread
{
	public void run()
	{
		System.out.println("Task 1");
	}
}
class Test2 extends Thread
{
	public void run()
	{
		System.out.println("Task 2");
	}
}
public class MultipleTask_MultipleThread
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Test1 t1 = new Test1();
		t1.start();
		
		Test2 t2 = new Test2();
		t2.start();
	}

}
