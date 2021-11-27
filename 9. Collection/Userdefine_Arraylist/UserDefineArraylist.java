package Userdefine_Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class UserDefineArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product_Pojo P1 = new Product_Pojo();
		Product_Pojo P2 = new Product_Pojo();
		
		P1.setPname("TV");
		P1.setPrice(23000.00);
		
		P2.setPname("Laptop");
		P2.setPrice(50000.00);
		
		ArrayList<Product_Pojo> arr = new ArrayList<Product_Pojo>();
		arr.add(P1);
		arr.add(P2);
		
		Iterator<Product_Pojo> itr = arr.iterator();
		while(itr.hasNext())
		{
			Product_Pojo pdt = (Product_Pojo)itr.next();
			System.out.println(pdt.getPname()+"====>"+pdt.getPrice());
		}
	}
}