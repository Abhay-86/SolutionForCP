import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sumofgcd {
    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int T = Integer.parseInt(br.readLine());
        long arr[]=new long[T];
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            long sum=0;
            for (int j = 1; j <= 2 * k; j++) {
                sum=sum+ gcd(k+j*j,k+(j+1)*(j+1));
            }
            arr[i]=sum;
        }
        for(int i=0;i<T;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static long gcd(long x, long y) {
        if (x == 0)
            return y;

        return gcd(y % x, x);
    }
}
