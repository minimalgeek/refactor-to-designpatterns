package com.csmastery.proxy;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;

@RequiredArgsConstructor
public class CachingPrimeCalculatorProxy implements IPrimeCalculator {

    private final IPrimeCalculator calculator;
    private HashMap<Long, Boolean> cachedNumbers = new HashMap<>();

    @Override
    public boolean isPrime(long i) {
        if (cachedNumbers.containsKey(i)) {
            return cachedNumbers.get(i);
        }
        boolean result = calculator.isPrime(i);
        cachedNumbers.put(i, result);
        return result;
    }
}
