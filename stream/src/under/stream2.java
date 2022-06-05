package under;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream2 {

	public static void main(String[] args) {
	    List<Integer> list = Arrays.asList(1, 2, 3);
	    Stream<Integer> stream = list.stream();
	    stream.forEach(System.out::println);
	}

}
