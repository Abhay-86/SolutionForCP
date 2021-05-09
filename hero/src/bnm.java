import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;

public class bnm {
    public static void main(String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(r);
        int a= Integer.parseInt(br.readLine());
        String arr1[]=new String[a];
        int m=0;
        for(int i=0;i<a;i++)
        {
            arr1[i]=br.readLine();
        }
        for(int j=0;j<a;j++)
        {
            int s1=Integer.parseInt(arr1[j].substring(0,arr1[j].indexOf(" ")));
            int s2=Integer.parseInt(arr1[j].substring(arr1[j].lastIndexOf(" ")+1,arr1[j].length()));
            for(int k=0;k<a;k++) {
                int s3 = Integer.parseInt(arr1[k].substring(0, arr1[k].indexOf(" ")));
                int s4 = Integer.parseInt(arr1[k].substring(arr1[k].lastIndexOf(" ") + 1, arr1[k].length()));
                if (0 <= k && k < j) {
                    if (s2 <= s3) {
                        m += 1;
                    }
                } else {
                    if (s2 <= s4) {
                        String temp = arr1[j];
                        arr1[j] = arr1[k];
                        arr1[k] = temp;
                    }
                }
            }
        }
        for(int i=0;i<a;i++)
        {
            System.out.println(arr1[i]);
        }
    }
}

