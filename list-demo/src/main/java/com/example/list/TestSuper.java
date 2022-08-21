package com.example.list;

import java.util.ArrayList;
import java.util.List;

public class TestSuper {
    public static void main(String[] args) {
        List<? super Number> list2 = new ArrayList<>();
        list2.add(null);
        list2.add(100);
        list2.add(200L);
        list2.add(300D);
        list2.add(400F);
        list2.add(null);
        System.out.println("list2 = " +list2);
    }
}
