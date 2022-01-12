package lambda.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import stream.stream.Member;

public class PredicateExample {

    private static final List<Member> memberList = Arrays.asList(
        new Member("Hong", Member.MALE, 20),
        new Member("Song", Member.FEMALE, 30),
        new Member("Dong", Member.MALE, 40)
    );

    public static double avg(Predicate<Member> predicate) {
        int count = 0, sum = 0;
        for (Member member : memberList) if (predicate.test(member)) {
            count++;
            sum += member.getAge();
        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
        double maleAvg = avg(member -> member.getSex() == Member.MALE);
        System.out.println(maleAvg);

        double femaleAvg = avg(member -> member.getSex() == Member.FEMALE);
        System.out.println(femaleAvg);
    }
}
