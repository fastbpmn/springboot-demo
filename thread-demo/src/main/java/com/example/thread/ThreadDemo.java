package com.example.thread;

import com.example.thread.pojo.Task;
import com.example.thread.pojo.Task2;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread = new Task();
        thread.start(); // 这是2022081902的开发分支

        Runnable thread2 = new Task2();
        thread2.run();
    }
}
