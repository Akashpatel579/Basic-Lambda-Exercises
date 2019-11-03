package filter_map_list.filter_orElse_findAny;

import java.util.Arrays;
import java.util.List;

public class NowJava8 {
	public static void main(String[] args) {

		List<Person>  persons = Arrays.asList(
				new Person("mkyong", 30),
				new Person("Akash", 26),
				new Person("Rutvik", 20)
		);

		Person results1 = persons.stream()
				.filter(x -> "Akash".equals(x.getName()))
				.findAny()
				.orElse(null);

		System.out.println(results1);

		Person result2 = persons.stream()
				.filter(x -> "Dharm".equals(x.getName()))
				.findAny()
				.orElse(null);

		System.out.println(result2);
	}
}
