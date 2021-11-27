//1. By reference variable
/*public class InitializeObject {

	String color;
	int age;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitializeObject buzo = new InitializeObject();
		
		buzo.color = "Black";
		buzo.age = 10;
		
		System.out.print(buzo.color+" "+buzo.age);
	}
}*/


// 2. By using Method
public class InitializeObject{
	String color;
	int age;
	
	void initobj(String c, int a) {
		color = c;
		age = a;
	}
	
	void Display() {
		System.out.print(color+" "+age);
	}
	
	public static void main(String[] args) {
		InitializeObject buzo = new InitializeObject();
		
		buzo.initobj("Black", 10);
		buzo.Display();
	}
}