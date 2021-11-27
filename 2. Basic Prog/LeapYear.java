
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year=1900;
		if(year%4 == 0) {
			if(year%100 == 0) {
				if(year%400 == 0) {
					System.out.print("The year "+year+" is leap year");
				}
				else
					System.out.print("The year "+year+" not leap year");
			}
			else
				System.out.print("The year "+year+" is leap year");
		}
		else
			System.out.print("The year "+year+" is not leap year");
	}

}
