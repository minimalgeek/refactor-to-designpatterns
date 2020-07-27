package com.csmastery.proxy;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

@RequiredArgsConstructor
public class CachingPrimeCalculatorProxy implements IPrimeCalculator {

    private final IPrimeCalculator iPrimeCalculator;
    private Map<Long, Boolean> isPrime = new WeakHashMap<>();

    @Override
    public boolean isPrime(long i) {
        if (isPrime.keySet().contains(i)) {
            return isPrime.get(i);
        }
        boolean result = iPrimeCalculator.isPrime(i);
        isPrime.put(i, result);
        return result;
    }
}
