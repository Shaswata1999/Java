
public class Sum_Series {

	int res=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum_Series ss = new Sum_Series();
		ss.series(8, 1);
	}
	int series(int x, int y) {
		if (y <= x) {
			System.out.println(y+" ");
			res = res+y;
			return(series(x,++y));
		}
		System.out.println("Sum of the series is: "+res);
		return 1;
	}

}
