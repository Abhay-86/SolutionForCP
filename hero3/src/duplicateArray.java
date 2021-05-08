import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class duplicateArray
{
    public static ArrayList<Integer> main(int arr[],int N) {
        ArrayList<Integer>arr1=new ArrayList<Integer>();
        for(int i=0;i<N;i++) {
            arr1.add(arr[i]);
        }
        for(int i=0;i<N;i++)
        {
            if(arr1.contains(i))
            {
                arr1.remove(arr1.indexOf(i));
            }
        }
        if(arr1.size()>0)
        {
            return arr1;
        }
        else
        {
            arr1.add(-1);
            return arr1;
        }
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        int N=Integer.parseInt(br.readLine());
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        System.out.println(main(arr,N));
    }
}