public class Num_series {

	int n=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Num_series ns = new Num_series();
		ns.series(5);
	}
	int series(int num) {
		if(n >= num) {
			System.out.println(n);
			n++;
		}
		return num;
	}
}