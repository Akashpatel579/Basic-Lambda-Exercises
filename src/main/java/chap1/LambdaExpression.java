package chap1;

public class LambdaExpression {
	public static void main(String[] args) {
		System.out.println(filled("Class A", new College(){

			public String classRoom(String str) {
				return str.toLowerCase();
			}
		} ));
	}

	private static String filled(String str, College college){
		return college.classRoom(str);
	}
}

interface College {
	String classRoom(String str);
}