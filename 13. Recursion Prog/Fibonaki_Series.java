
public class Fibonaki_Series {
	
	static int n0=0, n1=1, n2=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 7;
		System.out.print(n0+" "+n1);
		fibonaki(count-2);
	}
	static void fibonaki(int count) {
		if (count>0) {
			n2 = n1+n0;
			n0 = n1;
			n1 = n2;
			
			System.out.print(" "+n2);
			fibonaki(count-1);
		}
	}
}
