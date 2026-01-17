package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumber {
    public static void main(String args[])
    {
        List<Integer> numbers = Arrays.asList(22,7,45,44,1232);
        numbers=numbers.stream().filter(n-> n%2== 0).collect(Collectors.toList());

        System.out.println("Prime numbers: " + numbers);

    }

    private static boolean isPrime(Integer n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
