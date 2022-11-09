import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Integer[] intStream = new Integer[] {1, 2, 3, 4, 5, 6, 234, 2465, 3465, 467, 73355, 234, 67654, 67657};
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, intStream);

        list.stream()
                .filter(i -> i % 2 == 0)
                .forEach(i -> System.out.println(i));
    }
}