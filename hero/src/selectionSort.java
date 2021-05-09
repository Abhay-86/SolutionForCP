import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class selectionSort {
    public static long main(String a) throws IOException {
        long start=System.nanoTime();
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        //String a= br.readLine();
        int l=a.length();
        int arr[]=new int[l];
        for(int i=0;i<l;i++)
        {
            arr[i]=Integer.parseInt(a.substring(i,i+1));
        }
        for(int i=0;i<l-1;i++)
        {
            boolean sort = true;
            int minIndex=i;
            for(int j=i;j<l;j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        for(int i=0;i<l;i++)
        {
            System.out.print(arr[i]);
        }
        long end=System.nanoTime();
        System.out.println();
        //System.out.println(end-start);
        return end-start;
    }
}
