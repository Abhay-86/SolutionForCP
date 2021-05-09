import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class yup {
    public static void main(String[] args) throws IOException {
        InputStreamReader r= new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int a= Integer.parseInt(br.readLine());
        String arr[]=new String[a];
        for(int i=0;i<a;i++)
        {
            String b=br.readLine();
            int e=b.length();
            long h=number(e);
            for(long j=0;j<h;j++)
            {
                String f = Long.toBinaryString(j);
                int n=f.length();
                boolean g= subsequence(f,b,n,e);
                if(g)
                {
                    continue;
                }
                else
                {
                    arr[i]=Long.toBinaryString(j);
                    break;
                }
            }
        }
        for(int k=0;k<a;k++)
        {
            System.out.println(arr[k]);
        }
    }
    static boolean subsequence(String str1, String str2,int m, int n)
    {
        if (m == 0)
            return true;

        if (n == 0)
            return false;

        if (str1.charAt(m - 1) == str2.charAt(n - 1))
            return subsequence(str1, str2, m - 1, n - 1);

        return subsequence(str1, str2, m,n - 1);
    }
    static long number(int a)
    {
        String s="";
        for(int i=0;i<a;i++)
        {
            s=s+"1";
        }
        long b=Long.parseLong(s,2);
        return b;
    }
}
