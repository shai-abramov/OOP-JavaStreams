import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambdas {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        processNumbers(list,
                Lambdas::isPrime,
                System.out::println);
    }


    private static void processNumbers(Iterable<Integer> numbers,
                                       Predicate<Integer> predicate,
                                       Consumer<Integer> consumer) {
        for (int num : numbers) {
            if (predicate.test(num)) {
                consumer.accept(num);
            }
        }
    }

    private static boolean isPrime(int num) {
        int sqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return num > 1;
    }
}
