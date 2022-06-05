import java.lang.reflect.Member;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class stream3 {

	public static void main(String[] args) {
		 List<Member> list = Arrays.asList(
			        new Member("이산", Member.MALE, 30),
			        new Member("진영", Member.MALE, 26),
			        new Member("별찬", Member.MALE, 23),
			        new Member("민주", Member.FEMALE, 21)
			    );

			    Stream<Member> maleFemaleStream = list.stream();
			    Stream<Member> maleStream = maleFemaleStream.filter(m -> m.getSex() == Member.MALE);
			    IntStream ageStream = maleStream.mapToInt(Member::getAge);
			    OptionalDouble optionalDouble = ageStream.average();
			    double ageAvg = optionalDouble.getAsDouble();

			    System.out.println(ageAvg);
	}

}
