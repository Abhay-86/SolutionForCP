import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zaq {
    public static void main(String[] args) throws IOException {
    InputStreamReader r = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(r);
    int N=Integer.parseInt(br.readLine());
    int K=Integer.parseInt(br.readLine());
    int stealMoney=0;
    if(N%2==0)
    {
        stealMoney=(N/2)*K;
    }
    else
    {
        stealMoney=(N/2 +1)*K;
    }
        System.out.println(stealMoney);
    }
}
