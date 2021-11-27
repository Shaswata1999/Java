import java.util.*;
public class Create_TreeMAp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap hm = new TreeMap();
		hm.put("Mobile", new Double(14000.00));
		hm.put("TV", new Double(36000.00));
		hm.put("TAB", new Double(18000.00));
		hm.put("Laptop", new Double(50000.00));
		hm.put("Convection", new Double(22000.00));
		hm.put("Desktop", new Double(30000.00));
		
		Set hp = hm.entrySet();
		
		Iterator it = hp.iterator();
		while(it.hasNext())
		{
			Map.Entry me = (Map.Entry)it.next();
			System.out.println(me.getKey()+"===>"+me.getValue());
		}
	}

}
