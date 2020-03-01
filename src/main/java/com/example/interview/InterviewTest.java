package com.example.interview;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class InterviewTest {

    @Test
    public void testShortSet() {
        Set<Short> s = new HashSet<>();
        //byte short int ->int
        for (short i = 0; i < 100; i++) {
            s.add(i);//0 ... 99
            s.remove(i - 1);//short - integer = integer
        }
        System.out.println("size:" + s.size());//100
    }
}
