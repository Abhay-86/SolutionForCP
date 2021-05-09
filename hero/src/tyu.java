import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class tyu
{
    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++) {
            int b = Integer.parseInt(br.readLine());
            String arr1[] = new String[b];
            for (int j = -1; j < b; j++) {
                if(j==-1)
                {
                    for (int k = 0; k<b;k++)
                    {
                        arr1[k]=br.readLine();
                    }
                }
                else
                {
                    for(int l=j+1;l<b;l++)
                    {
                        if(Integer.parseInt(String.valueOf(arr1[j].charAt(2)))>=Integer.parseInt(String.valueOf(arr1[l].charAt(2))))
                        {
                            String temp=arr1[j];
                            arr1[j]=arr1[l];
                            arr1[l]=temp;
                        }
                        else
                        {
                            continue;
                        }
                    }
                }
            }
            for(int l=0;l<b;l++)
            {
                System.out.println(arr1[l]);
            }
        }
    }
}