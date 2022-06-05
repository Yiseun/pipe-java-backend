package under;

import java.util.Arrays;
import java.util.List;

import com.sun.java.util.jar.pack.Package.Class.Member;

public class stream4 {

	public static void main(String[] args) {
	    List<Member> list = Arrays.asList(
	            new Member("�̻�", Member.MALE, 30),
	            new Member("����", Member.MALE, 26),
	            new Member("����", Member.MALE, 23),
	            new Member("����", Member.FEMALE, 21)
	        );

	        double ageAvg = list.stream()
	            .filter(m -> m.getSex() == Member.MALE)
	            .mapToInt(Member::getAge)
	            .average()
	            .getAsDouble();

	        System.out.println(ageAvg);
	}

}
