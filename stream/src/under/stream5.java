package under;

import java.util.Arrays;
import java.util.List;

public class stream5 {

	public static void main(String[] args) {
	    List<String> names = Arrays.asList("이산", "진영", "이산", "이산", "별찬");
	    names.stream()
	      .distinct()
	      .forEach(System.out::println);
	}

}
