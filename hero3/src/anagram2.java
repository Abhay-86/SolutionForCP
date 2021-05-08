import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class anagram2 {
    public static int main(int N,String S1,String S2) {
        int arr[]=new int[256];
        int sum=0;
        for(int i=0;i<N;i++)
        {
            arr[(int)S1.charAt(i)]++;
            arr[(int)S2.charAt(i)]--;
        }
        for(int i=97;i<=122;i++)
        {
            sum=sum+Math.abs(arr[i]);
        }
        return sum/2;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader r= new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        int N=Integer.parseInt(br.readLine());
        String S1=br.readLine();
        String S2=br.readLine();
        int digit=  main(N,S1,S2);
        System.out.println(digit);
    }
}
