import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class noOfAnagramWord {
    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int N=Integer.parseInt(br.readLine());
        int b=N;
        ArrayList<String > arr=new ArrayList<String>();
        ArrayList<String > arr1=new ArrayList<String>();
        for(int i=0;i<N;i++)
        {
            arr.add(br.readLine());
        }
        for(int i=0;i<b;i++)
        {
            for(int j=i+1;j<b;j++)
            {
                if(arr.get(i).length()== arr.get(j).length())
                {
                    anagram st = new anagram();
                    boolean a= st.ana(arr.get(i), arr.get(j));
                    if(a)
                    {
                        arr1.add(arr.get(j));
                        arr.remove(j);
                        b = arr.size();
                    }
                    else
                    {
                        if(i==b)
                        {
                            arr1.add(" ");
                            arr1.add(arr.get(i));
                        }
                    }
                }
            }
            arr1.add(" ");
        }
        int l2=arr.size();
        for(int i=0;i<l2;i++)
        {
            if(arr1.get(i).equals(" "))
            {
                System.out.println(" ");
            }
            else
            {
                System.out.print(arr1.get(i)+ " ");
            }
        }
    }
}
class anagram
{
    public boolean ana(String a,String b)
    {
        int l=a.length();
        String c="";
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(a.charAt(i)==b.charAt(j))
                {
                    if(j==0)
                    {
                        c="0"+c;
                        b=b.substring(1,l)+"0";
                        break;
                    }
                    else if(j==l-1)
                    {
                        c=c+"0";
                        b=b.substring(0,l-1)+"0";
                        break;
                    }
                    else
                    {
                        c=c+"0";
                        b=b.substring(0,j)+b.substring(j+1,l);
                        break;
                    }
                }
            }
        }
        if(c.equals(b))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
