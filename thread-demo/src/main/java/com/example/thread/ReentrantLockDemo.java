package com.example.thread;

public class ReentrantLockDemo {
    public static void main(String[] args) {
        ReentrantLockThread reentrantLockThread = new ReentrantLockThread();
        reentrantLockThread.run();
    }
}
