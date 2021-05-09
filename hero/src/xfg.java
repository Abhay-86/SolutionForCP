import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class xfg
{
    public static void main(String[] args) throws IOException {
        InputStreamReader r= new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        String a=br.readLine();
        selectionSort st = new selectionSort();
        long b=st.main(a);
        bubbleSort su = new bubbleSort();
        long c=su.main(a);
        System.out.println("Time in selectionsort "+b);
        System.out.println("Time in bubblesort "+c);
    }
}