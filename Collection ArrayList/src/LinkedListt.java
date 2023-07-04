import java.util.LinkedList;

public class LinkedListt {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.add("Elma");
		list.add("Armut");
		list.add("Kavun");
		
		list.add(1,"Karpuz");
		
		list.forEach(i -> System.out.println(i));
	}

}
