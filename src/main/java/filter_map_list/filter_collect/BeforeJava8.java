package filter_map_list.filter_collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeforeJava8 {
	public static void main(String[] args) {
		List<String> lines = Arrays.asList("spring","node", "mkyong");
		List<String> result = getFilterOutput(lines, "mkyoung");

		for (String temp: result){
			System.out.println("filtered Name : "+ temp);
		}

	}

	private static List<String> getFilterOutput(List<String> lines, String mkyoung) {

		List<String> result = new ArrayList<>();
		for (String line : lines) {
			if (!"mkyong".equals(line)) {
				result.add(line);
			}
		}

		return result;
	}
}



//	List<String> result = new ArrayList<>();
//        for (String line : lines) {
//				if (!"mkyong".equals(line)) { // we dont like mkyong
//				result.add(line);
//				}
//				}
//				return result;