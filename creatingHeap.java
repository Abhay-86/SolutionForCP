// creating high heap
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class creatingHeap {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
       int a=Integer.parseInt(br.readLine());
       int arr[]=new int[a];
       for(int i=0;i<a;i++)
       {
           arr[i]=Integer.parseInt(br.readLine());
           int current=i;
           int b=i+1;
           while(b!=1)
           {
               b=b/2;
               if(arr[current]>arr[b-1]){
                   int temp=arr[current];
                   arr[current]=arr[b-1];
                   arr[b-1]=temp;
               }
               current=b-1;
           }
       }
       for(int i=0;i<a;i++)
       {
           System.out.println(arr[i]);
       }
    }
}
