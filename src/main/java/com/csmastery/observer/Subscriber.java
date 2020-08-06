package com.csmastery.observer;

public interface Subscriber<T> {

    void update(T content);
}
