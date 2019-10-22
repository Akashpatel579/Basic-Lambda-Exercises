package chap2.chap1;

import java.util.function.Function;

public class LambdaExpression {
	public static void main(String[] args) {
		System.out.println(filled("Class A",  str -> str.toLowerCase()));
	}

	private static String filled(String str, Function<String , String> college){
		return college.apply(str);
	}
}