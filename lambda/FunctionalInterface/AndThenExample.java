package lambda.FunctionalInterface;

import java.util.function.Consumer;
import stream.stream.Member;

public class AndThenExample {

    public static void main(String[] args) {
        Consumer<Member> consumerA = member -> System.out.println("consumerA : " + member.getName());
        Consumer<Member> consumerB = member -> System.out.println("consumerB : " + member.getAge());

        Consumer<Member> consumerAB = consumerA.andThen(consumerB);
        consumerAB.accept(new Member("hong", 3, 30));
    }
}
