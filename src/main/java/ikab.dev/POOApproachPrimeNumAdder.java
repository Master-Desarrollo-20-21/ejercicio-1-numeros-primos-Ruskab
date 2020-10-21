package ikab.dev;

import java.util.concurrent.atomic.AtomicInteger;

public class POOApproachPrimeNumAdder {

    public int sumPrimeNumbersInFirst50Numbers() {
        // La suma de los números primos que hay entre los 50 primeros números
        int result = 0;
        for (int i = 0; i < 50; i++) {
            if (isPrimeNumber(i)) {
                result += i;
            }
        }
        return result;
    }

    public int sumFirst50PrimeNumbers() {
        // La suma de los 50 primeros números primos
        AtomicInteger primeNumberCounter = new AtomicInteger();
        AtomicInteger numberCounter = new AtomicInteger(2);
        int result = 0;
        while (primeNumberCounter.get() < 50) {
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
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}

