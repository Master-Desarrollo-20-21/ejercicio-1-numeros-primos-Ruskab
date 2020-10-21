package ikab.dev;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class FuncionalApproachPrimeNumAdder {

    public static final int PRIME_NUMBERS_COUNT_LIMIT = 50;
    public static final int FIRST_PRIME_NUMBER = 2;
    public static final int NUM_COUNT_LIMIT = 50;

    public int sumPrimeNumbersInFirst50Numbers() {
        // La suma de los números primos que hay entre los 50 primeros números
        return IntStream.rangeClosed(1, NUM_COUNT_LIMIT).filter(this::isPrimeNumber).sum();
    }

    public int sumFirst50PrimeNumbers() {
        // La suma de los 50 primeros números primos
        AtomicInteger counter = new AtomicInteger(FIRST_PRIME_NUMBER);
        List<Integer> primeNumbers = new ArrayList<>();
        while (primeNumbers.size() < PRIME_NUMBERS_COUNT_LIMIT) {
            int actualNumber = counter.getAndIncrement();
            if (isPrimeNumber(actualNumber)) {
                primeNumbers.add(actualNumber);
            }
        }
        return primeNumbers.stream().reduce(0, Integer::sum);
    }


    protected boolean isPrimeNumber(int number) {
        if (number < FIRST_PRIME_NUMBER) {
            return false;
        }
        if (number == FIRST_PRIME_NUMBER) {
            return true;
        }
        return IntStream.rangeClosed(FIRST_PRIME_NUMBER, number - 1).allMatch(i -> number % i != 0);
    }

}

