import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sumandproduct {
    public static long main(int n) {
        long sum=0;
        for(int i=1;i<=n;i++)
        {
              sum=sum+(n/i)*i;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        int n=Integer.parseInt(br.readLine());
        long sum=main(n);
        System.out.println(sum);
    }
}
