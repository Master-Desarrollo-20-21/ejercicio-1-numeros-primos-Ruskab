package ikab.dev;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class FuncionalApproachPrimeNumAdder {

    public int sumPrimeNumbersInFirst50Numbers() {
        // La suma de los números primos que hay entre los 50 primeros números
        return IntStream.rangeClosed(1, 50).filter(this::isPrimeNumber).sum();
    }

    public int sumFirst50PrimeNumbers() {
        // La suma de los 50 primeros números primos
        AtomicInteger counter = new AtomicInteger();
        List<Integer> primeNumbers = new ArrayList<>();
        while (primeNumbers.size() < 50) {
            int actualNumber = counter.getAndIncrement();
            if (isPrimeNumber(actualNumber)) {
                primeNumbers.add(actualNumber);
            }
        }
        return primeNumbers.stream().reduce(0, Integer::sum);
    }


    protected boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        return IntStream.rangeClosed(2, number - 1).allMatch(i -> number % i != 0);
    }

}

