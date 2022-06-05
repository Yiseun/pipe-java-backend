package under;

import java.util.Arrays;
import java.util.List;

import com.sun.java.util.jar.pack.Package.Class.Member;

public class stream4 {

	public static void main(String[] args) {
	    List<Member> list = Arrays.asList(
	            new Member("이산", Member.MALE, 30),
	            new Member("진영", Member.MALE, 26),
	            new Member("별찬", Member.MALE, 23),
	            new Member("민주", Member.FEMALE, 21)
	        );

	        double ageAvg = list.stream()
	            .filter(m -> m.getSex() == Member.MALE)
	            .mapToInt(Member::getAge)
	            .average()
	            .getAsDouble();

	        System.out.println(ageAvg);
	}

}
