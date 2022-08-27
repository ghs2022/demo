package com.jsoft;

import com.jsoft.entiry.Dept;
import com.jsoft.entiry.Emp;

import java.util.ArrayList;
import java.util.List;

public class Demo2<T> {


    public List<T> test() {
        List<T> list = new ArrayList<>();
        T t = (T)new Dept("bm","cc");
        list.add(t);
        return list;
    }

    public static void main(String[] args) {
        Demo2<Dept> deptDemo2 = new Demo2<>();
        List<Dept> test = deptDemo2.test();
        System.out.println(test);
    }
}
