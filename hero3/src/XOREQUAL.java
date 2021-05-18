import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XOREQUAL {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        int T=Integer.parseInt(br.readLine());
        long arr[]=new long[T];
        for(int i=0;i<T;i++)
        {
            int n=Integer.parseInt(br.readLine());
            long m=1000000007;
            long out=1;
            long a = 2;
            long b=n-1;
            while(b>0)
            {
                if(b%2!=0)
                {
                    out=out*a%m;
                }
                a=a*a%m;
                b=b/2;
            }
            arr[i]=out;
        }
        for(int i=0;i<T;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
