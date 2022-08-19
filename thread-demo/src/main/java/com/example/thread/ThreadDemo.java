package com.example.thread;

import com.example.thread.pojo.Task;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread = new Task();
        // 这是2022081901的开发分支
        thread.start(); // 这是2022081902的开发分支
    }
}
