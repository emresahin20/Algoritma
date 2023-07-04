import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListt {

	public static void main(String[] args) {

		ArrayList country = new ArrayList();
		country.add("İstanbul");
		country.add("İzmir");
		country.add("Ankara");
		country.add("Muğla");
		
		country.add(1, "Denizli");
		
		country.remove(3);
		
		Iterator itr = country.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//country.forEach(i -> System.out.println(i));
	}
}
