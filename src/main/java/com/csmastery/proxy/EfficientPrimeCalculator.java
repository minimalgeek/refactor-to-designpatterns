package com.csmastery.proxy;

public class EfficientPrimeCalculator implements IPrimeCalculator {
    @Override
    public boolean isPrime(long i) {
        int counter = 0;
        for (long num = i; num >= 1; num--) {
            if (i % num == 0) {
                counter = counter + 1;
            }
        }
        return counter == 2;
    }
}
