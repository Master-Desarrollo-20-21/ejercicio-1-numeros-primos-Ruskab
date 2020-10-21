package ikab.dev;

import java.util.concurrent.atomic.AtomicInteger;

public class POOApproachPrimeNumAdder {

    public static final int NUM_COUNT_LIMIT = 50;
    public static final int FIRST_PRIME_NUMBER = 2;
    public static final int PRIME_NUMBERS_COUNT_LIMIT = 50;

    public int sumPrimeNumbersInFirst50Numbers() {
        // La suma de los números primos que hay entre los 50 primeros números
        int result = 0;
        for (int i = 0; i < NUM_COUNT_LIMIT; i++) {
            if (isPrimeNumber(i)) {
                result += i;
            }
        }
        return result;
    }

    public int sumFirst50PrimeNumbers() {
        // La suma de los 50 primeros números primos
        AtomicInteger primeNumberCounter = new AtomicInteger();
        AtomicInteger numberCounter = new AtomicInteger(FIRST_PRIME_NUMBER);
        int result = 0;
        while (primeNumberCounter.get() < PRIME_NUMBERS_COUNT_LIMIT) {
            int actualNumber = numberCounter.getAndIncrement();
            if (isPrimeNumber(actualNumber)) {
                primeNumberCounter.getAndIncrement();
                result += actualNumber;
            }
        }
        return result;
    }


    protected boolean isPrimeNumber(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = FIRST_PRIME_NUMBER; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}

