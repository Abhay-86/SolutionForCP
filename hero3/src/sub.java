import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class sub
{
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        int T=Integer.parseInt(br.readLine());
        int arr[]=new int[T];
        for(int i=0;i<T;i++)
        {
            String in=br.readLine();
            int N=Integer.parseInt(in.substring(0,in.indexOf(' ')));
            in=in.substring(in.indexOf(' ')+1);
            int M=Integer.parseInt(in);
            int count=0;
            for(int b=2;b<=N;b++)
            {
                int a=(M-(M%b));
                for(int j=1;j<a;j++)
                {
                    if(a%j==0) {
                        int c = a / j;
                        if (c > j) {
                            if (c < b) {
                                if (j != b) {
                                    count = count + 2;
                                   // System.out.println(c + " " + b);
                                    //System.out.println(j + " " + b);
                                }
                                else{
                                    continue;
                                }
                            }
                            else {
                                if (j != b) {
                                    count = count + 1;
                                    //System.out.println(j + " " + b);
                                }
                                else
                                {
                                    continue;
                                }
                            }
                        }
                        else if(c==j)
                        {
                            if(c<b)
                                if(j!=b) {
                                    count++;
                                }
                            else
                                {
                                    continue;
                                }
                            //System.out.println(c+" "+b);
                        }
                        else
                        {
                            break;
                        }
                    }
                }
            }
            arr[i]=count;
        }
        for(int i=0;i<T;i++)
        {
            System.out.println(arr[i]);
        }
    }
}