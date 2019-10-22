package chap1;

public class PassingBehavior {
	public static void main(String[] args) {
		System.out.println(process("Hello world", new Processor(){
			public String process1(String str){
				return str.toLowerCase();
			}
		}));
	}

	private static String process(String str, Processor processor){
		return processor.process1(str);
	}
}

interface Processor {
	String process1 (String str);
}
