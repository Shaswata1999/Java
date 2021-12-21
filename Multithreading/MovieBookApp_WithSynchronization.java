class BTS
{
	int total_seat = 10;
	synchronized void bookseat(int seat)
	{
		if(total_seat >= seat)
		{
			System.out.println("Seats are booked successfully...");
			total_seat = total_seat-seat;
			System.out.println("Seats left: "+seat);
		}
		else
		{
			System.out.println("Seats can not be booked !!!!!");
			System.out.println("seats left : "+total_seat);
		}
	}
}
public class MovieBookApp_WithSynchronization extends Thread
{

	static BTS b;
	int seats;
	public void run()
	{
		b.bookseat(seats);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		b = new BTS();
		
		MovieBookApp_WithSynchronization Shaswata = new MovieBookApp_WithSynchronization();
		Shaswata.seats=7;
		Shaswata.start();
		
		MovieBookApp_WithSynchronization Sayan = new MovieBookApp_WithSynchronization();
		Sayan.seats=6;
		Sayan.start();
	}

}
