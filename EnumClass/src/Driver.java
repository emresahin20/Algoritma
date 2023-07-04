import java.time.DayOfWeek;
import java.time.Month;

public class Driver {

	public static void main(String[] args) {
		
		Aylar ay = Aylar.Aralık;
		System.out.println(ay);
		
		ay=Aylar.Ekim;
		System.out.println(ay);
		
		Aylar [] values = Aylar.values();
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		Aylar valueOf= Aylar.valueOf("Subat");
		System.out.println(valueOf);
		
		DayOfWeek sunday= DayOfWeek.MONDAY;
		System.out.println(sunday);
		
		//DayOfWeek of = DayOfWeek.of(1);
		//System.out.println(of);
		
		//Month fabruary = Month.APRIL;
		//System.out.println(fabruary);
	}
}
