package abhayMade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class sumOf {
    int out(String s)
    {
        int c=0;
        Scanner st=new Scanner(s);
        while (st.hasNext())
        {
            if(st.hasNextInt()) {
                c = c + st.nextInt();
            }
            System.out.println(c);
        }
        st.close();
        return c;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        String s=br.readLine();
        sumOf sr=new sumOf();
        int a= sr.out(s);
        System.out.println(a);
    }
}
