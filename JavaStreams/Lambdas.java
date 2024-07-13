import java.util.*;

public class Lambdas {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        processNumbers(list, new IsEvenIntPredicate());
    }

    private static void processNumbers(Iterable<Integer> numbers,
                                       IntPredicate predicate) {
        for (int num : numbers) {
            if (predicate.acceptNumber(num)) {
                System.out.print(num + " ");
            }
        }
    }
}

interface IntPredicate {
    boolean acceptNumber(int num);
}

class IsEvenIntPredicate implements IntPredicate {
    @Override
    public boolean acceptNumber(int num) {
        return num % 2 == 0;
    }
}