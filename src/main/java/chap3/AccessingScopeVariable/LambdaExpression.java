package chap3.AccessingScopeVariable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaExpression {
	public static void main(String[] args) {

		final String prefix = "Mr. ";
		System.out.println(filled("Hello World", str -> {
			return prefix.concat(str);
		} ));

		String[] names = {"Mr Akash", "Ms Aditi", "Dr Dhar"};

		// Lambda in Java 7
//		Arrays.sort(names, new Comparator<String>() {
//			@Override
//			public int compare(String name1, String name2) {
//				return name1.split(" ")[1].compareTo(name2.split(" ")[1]);
//			}
//		});

		// Lambda in Java 8
//		Arrays.sort(names , ( name1, name2) ->
//			name1.split(" ")[1].compareTo(name2.split(" ")[1])
//		);

		//Method referencing
		Arrays.sort(names, Comparator.comparing(LambdaExpression::firstName).reversed()
		);

		System.out.println(Arrays.toString(names));
	}

	public static String firstName(String name) {
		return name.split(" ")[1];
	}

//	private static String full_name(String akash_patel) {
//		return null;
//	}

	private static String filled(String str, Function<String , String> college){
		return college.apply(str);
	}



}