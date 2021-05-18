package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ink {
    public int strstr(String s,String x) {
        boolean a=false;
        int b = 0;
        for(int i=0;i<=s.length()-x.length();i++) {
            if (s.substring(i, x.length() + i).equals(x)) {
                b=i;
                a=true;
                break;
            }
        }
        if(a)
            return b;
        else
            return -1;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        String s=br.readLine();
        String x=br.readLine();
        ink st=new ink();
        int c=st.strstr(s,x);
        System.out.println(c);
    }
}
