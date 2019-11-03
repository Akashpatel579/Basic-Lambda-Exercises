package filter_map_list.filter_orElse_findAny;

import java.util.Arrays;
import java.util.List;

public class BeforeJava8 {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(
				new Person("mkyong", 30),
				new Person("Akash", 26),
				new Person("Rutvik", 20)
		);

		Person result = getStudentByName(persons, "Akash");
		System.out.println(result);
	}

	private static Person getStudentByName(List<Person> persons, String name) {

		Person result = null;
		for(Person temp : persons){
			if(name.equals(temp.getName())){
				result = temp;
			}
		}
		return  result;
	}
}
