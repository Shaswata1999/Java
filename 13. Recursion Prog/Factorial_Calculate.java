
public class Factorial_Calculate {
	
	int fact = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial_Calculate fc = new Factorial_Calculate();
		int res = fc.fact_cal(5);
		System.out.println(res);
	}
	int fact_cal(int num) {
		if(num>1) {
			fact = fact*num;
			fact_cal(num-1);
		}
		return fact;
	}

}
