import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bubbleSort {
        public static long main(String a) throws IOException {
            long start = System.nanoTime();
            InputStreamReader r = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(r);
            //String a=br.readLine();
            int l=a.length();
            int arr[]=new int[l];
            for(int i=0;i<l;i++) {
                arr[i] = Integer.parseInt(a.substring(i,i+1));
            }
            for(int i=0;i<l;i++)
            {
                for(int j=i+1;j<l;j++)
                {
                    if(arr[i]>arr[j])
                    {
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            for(int i=0;i<l;i++)
            {
                System.out.print(arr[i]);
            }
            long end = System.nanoTime();
            System.out.println();
            //System.out.println(end-start);
            return end-start;
        }
    }
