package com.example.list;

import java.util.ArrayList;
import java.util.List;

public class TestExtends {
    public static void main(String[] args) {
        List<? extends Number> list1 = new ArrayList<Integer>();
        list1.add(null);
        list1.add(null);
        System.out.println("list1 = " + list1);

    }
}
