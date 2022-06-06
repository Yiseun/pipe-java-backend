package under;

import java.util.Arrays;
import java.util.List;

public class stream5 {

	public static void main(String[] args) {
	    List<String> names = Arrays.asList("이산", "진영", "이산", "이산", "별찬");
	    names.stream()
	        .distinct() // 중복 제거
	        .filter(name -> name.equals("이산")) // 이산이라는 이름을 가진 이름만 리스트에 남겨 둠.
	        .forEach(System.out::println);
	}

}
