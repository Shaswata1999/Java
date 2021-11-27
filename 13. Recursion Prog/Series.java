import java.util.Scanner;
public class Series {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter any number:");
	        n = s.nextInt();
	        Series obj = new Series();
	        System.out.print("Natural numbers till "+n+" is :");
	        obj.series(n,1);
	}
	int series(int y, int i) {
		 if(i <= y)
	        {
	            System.out.print(i+" ");
	            return(series(y,++i));
	        }
	        return 1;
	}

}
