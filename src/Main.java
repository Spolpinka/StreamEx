import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intStream = new int[] {1, 2, 3, 4, 5, 6, 234, 2465, 3465, 467, 73355, 234, 67654, 67657};

        long x = Arrays.stream(intStream)
                .filter(i -> i % 2 == 0)
                .sum();
        System.out.println(x);
    }
}