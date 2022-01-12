package lambda.FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;
import stream.stream.Member;

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<String> consumer = s
            -> System.out.println("Consumer Functional Interface : " + s);
        consumer.accept("consumer");

        BiConsumer<String, Integer> biConsumer = (s, i)
            -> System.out.println("BiConsumer Functional Interface : " + s + " " + i);
        biConsumer.accept("biConsumer", 1);

        ObjIntConsumer<Member> objIntConsumer = (member, i)
            -> System.out.println("ObjIntConsumer Functional InterFace : " + member + " " + i);
        objIntConsumer.accept(new Member("hong", Member.MALE, 30), 100);
    }
}
