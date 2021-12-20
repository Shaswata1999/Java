class BookTheaterSeat
{
	int total_seat = 10;
	void bookseat(int seat)
	{
		if(total_seat >= seat)
		{
			System.out.println("Seats are booked successfully...");
			total_seat = total_seat-seat;
			System.out.println("Seats left: "+seat);
		}
		else
		{
			System.out.println("Seats can not be booked");
			System.out.println("seats left : "+total_seat);
		}
	}
}
public class MovieBookApp_WithoutSyschronization extends Thread
{
	static BookTheaterSeat b;
	int seats;
	public void run()
	{
		b.bookseat(seats);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		b = new BookTheaterSeat();
		
		MovieBookApp_WithoutSyschronization Shaswata = new MovieBookApp_WithoutSyschronization();
		Shaswata.seats=7;
		Shaswata.start();
		
		MovieBookApp_WithoutSyschronization Sayan = new MovieBookApp_WithoutSyschronization();
		Sayan.seats=6;
		Sayan.start();
	}
}