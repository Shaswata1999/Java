
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 121;
		int temp = check_palindrome(num, 0);
		if(temp == num)
			System.out.println("The number is palindrome");
		else
			System.out.println("The number is not palindrome");
	}
	static int check_palindrome(int num, int temp) {
		if(num == 0)
			return temp;
		
		temp = (temp*10)+(num%10);
		return check_palindrome(num/10, temp);
	}

}
