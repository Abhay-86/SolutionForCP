import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class drt
{
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        int a=Integer.parseInt(br.readLine());
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            String s1=br.readLine();
            String s2=br.readLine();
            int l1=s1.length();
            int l2=s2.length();
            int arr1[][]=new int[l1][l2];
            int b=0;
            for(int j=0;j<l1;j++)
            {
                for(int k=0;k<l2;k++)
                {
                    if(s1.charAt(j)==s2.charAt(k))
                    {
                        if(j==0||k==0)
                        {
                            arr1[j][k]=1;
                        }
                        else
                        {
                            arr1[j][k]=1+arr1[j-1][k-1];
                        }
                    }
                    if(b<arr1[j][k])
                    {
                        b=arr1[j][k];
                    }
                }
            }
            int l=l1+l2-2*b;
            arr[i]=l;
        }
        for(int i=0;i<a;i++)
        {
            System.out.println(arr[i]);
        }
    }
}