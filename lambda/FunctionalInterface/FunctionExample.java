package lambda.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import stream.stream.Member;

public class FunctionExample {

    private static final List<Member> memberList = Arrays.asList(
        new Member("hong", Member.MALE, 13),
        new Member("kong", Member.MALE, 25),
        new Member("Song", Member.FEMALE, 53)
    );

    private static void supplyString (Function<Member, String> function) {
        for (Member member : memberList) {
            System.out.println(function.apply(member) + " ");
        }
        System.out.println();
    }

    private static void supplyInt (ToIntFunction<Member> function) {
        for (Member member : memberList) {
            System.out.println(function.applyAsInt(member) + " ");
        }
        System.out.println();
    }

    private static double avg (ToIntFunction<Member> function) {
        int sum = 0;
        for (Member member : memberList) sum += function.applyAsInt(member);
        return (double) sum / memberList.size();
    }


    public static void main(String[] args) {
        supplyString(Member::getName);
        supplyInt(Member::getSex);
        supplyInt(Member::getAge);

        System.out.println(avg(Member::getAge));
    }

}
