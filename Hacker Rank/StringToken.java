import java.util.*;
import java.util.stream.Collectors;
public class StringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		String split[] = s.split("[!,?._'@ ]");
		split = Arrays.asList(split).stream().filter(str -> !str.isEmpty()).collect(Collectors.toList()).toArray(new String[0]);
		System.out.println(split.length);
		for(String z : split)
			System.out.println(z);
	}
}