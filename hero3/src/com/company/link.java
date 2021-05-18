package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class link {
   public static void main(String[] args) {
        List<Boolean> st = new LinkedList<>();
        List<String> st1 = new ArrayList<>();
        List<Integer> st2 = new ArrayList<>();
        for(int j=65;j<71;j++)
        {
            st1.add(Character.toString((char)j));
        }
        int timestart= (int) System.nanoTime();
        for(int i=71;i<97;i++)
        {
            st.add(0,st1.add(Character.toString((char) i)));
        }
       System.out.println(st);
       int timeEnd=(int) System.nanoTime();
        System.out.println(timeEnd-timestart);
        int timestart1= (int) System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            st2.add(0, i);
        }
        int timeEnd1=(int) System.nanoTime();
        System.out.println(timeEnd1-timestart1);
    }
}
