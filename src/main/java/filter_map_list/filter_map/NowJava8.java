package filter_map_list.filter_map;

import filter_map_list.filter_orElse_findAny.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NowJava8 {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("myyong", 20),
				new Person("Akash", 25)
		);

		String name = persons.stream()
				.filter(x -> "Akash".equals(x.getName()))
				.map(Person::getName)
				.findAny()
				.orElse("");


		System.out.println("Name : " + name);

		List<String> collect = persons.stream()
				.map(Person::getName)
				.collect(Collectors.toList());

		collect.forEach(System.out::println);
	}
}
