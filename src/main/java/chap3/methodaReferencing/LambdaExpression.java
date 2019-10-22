package chap3.methodaReferencing;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaExpression {
	public static void main(String[] args) {
		// System.out.println(filled("Class A",  String::toString));

		//System.out.println(filled2("Class A", 5 ,  (str, i) -> str.substring(i)));
		// System.out.println(filled2("Class A", 5, String::substring));

		String prefix = "Mr. ";
//		System.out.println(filled("Akash Patel", str -> prefix.concat(str)));
		// method references
		System.out.println(filled("Akash Patel", prefix::concat));

	}

//	private static String full_name(String akash_patel) {
//		return null;
//	}

	private static String filled2(String str, int i, BiFunction<String, Integer, String> processor) {
		return processor.apply(str, i);

	}

	private static String filled(String str, Function<String , String> college){
		return college.apply(str);
	}



}