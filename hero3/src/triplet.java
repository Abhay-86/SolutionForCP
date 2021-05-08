import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class triplet
{
    public static boolean sum(int arr[],int N) {
        ArrayList<Integer> arr1= new ArrayList<Integer>();
        ArrayList<Integer> arr2=new ArrayList<Integer>();
        int sum;
        boolean a=false;
        for(int i =0;i<N;i++)
        {
            if(arr[i]>=0)
            {
                arr1.add(arr[i]);
            }
            else
            {
                arr2.add(arr[i]);
            }
        }
        for(int i=0;i<arr1.size();i++)
        {
            for(int j=i+1;j<arr1.size();j++)
            {
                sum=arr1.get(i)+arr1.get(j);
                if(arr2.contains(-sum))
                {
                    a=true;
                    break;
                }
            }
            if(a)
            {
                break;
            }
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        int a=Integer.parseInt(br.readLine());
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        boolean b= triplet.sum(arr,a);
        if(b)
        {
            System.out.println("Triplet");
        }
        else
        {
            System.out.println("Not triplet");
        }
    }

}