package under;

import java.util.Arrays;
import java.util.List;

public class stream5 {

	public static void main(String[] args) {
	    List<String> names = Arrays.asList("�̻�", "����", "�̻�", "�̻�", "����");
	    names.stream()
	      .distinct()
	      .forEach(System.out::println);
	}

}
