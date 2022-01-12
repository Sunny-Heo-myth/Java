package stream;

import java.util.Arrays;

public class reduction {

    public static void main(String[] args) {
        int[] ints = new int[] {1,2,3,4,5,6,7,8,9,0};

        long count = Arrays.stream(ints)
            .filter(i -> i%2 == 0)
            .count();
        System.out.println(count);
    }
}
