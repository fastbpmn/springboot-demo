package com.example.thread.pojo;

public class Task extends Thread{
    @Override
    public void run() {
        System.out.println("这是一个线程");
    }
}
