import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class createAndSortingHeap {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        int length=Integer.parseInt(br.readLine());
        int len=length;
        int arr[]=new int[length];
        for(int i=0;i<length;i++)
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
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        while(length!=1)
        {
            int temp=arr[0];
            arr[0]=arr[length-1];
            arr[length-1]=temp;
            for(int i=0;2*(i+1)<length-1;i++)
            {
                int b=i+1;
                if(arr[2*b-1]>arr[2*b]) {
                    if (arr[2 * b - 1] > arr[b - 1]) {
                        int temp1 = arr[2 * b - 1];
                        arr[2 * b - 1] = arr[b - 1];
                        arr[b - 1] = temp1;
                    }
                }
                else {
                    if (arr[2 * b] > arr[b - 1]) {
                        int temp1 = arr[2 * b];
                        arr[2 * b] = arr[b - 1];
                        arr[b - 1] = temp1;
                    }
                }
            }
            length=length-1;
        }
     //   int temp=arr[0];
   //     arr[0]=arr[1];
    //    arr[1]=temp;
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
