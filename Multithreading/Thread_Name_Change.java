
public class Thread_Name_Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello");
		System.out.println("Curreny Thread name is => "+Thread.currentThread().getName());	// return the current thread name
		
		Thread.currentThread().setName("Shaswata");		// Change the thread name
		System.out.println("Thread Name after change => "+Thread.currentThread().getName());
	}

}
