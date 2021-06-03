import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class rand3<X,Y> {
    private X x;
    private Y y;

    public rand3(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public X getX() {
        return x;
    }

    public void setX(X x) {
        this.x = x;
    }

    public Y getY() {
        return y;
    }

    public void setY(Y y) {
        this.y = y;
    }
    public static void main(String[] args) {
        FastReader st=new FastReader();
        ArrayList<rand<Integer>> a=new ArrayList<>();
        int T=st.nextInt();
        for(int i=0;i<T;i++)
        {
            String b=st.nextLine();
            StringTokenizer sd=new StringTokenizer(b);
            a.add(new rand<Integer>(Integer.parseInt(sd.nextToken()),Integer.parseInt(sd.nextToken())));
        }
        rand<Integer> sv=new rand<>(40,10);
        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i).getX()+" "+a.get(i).getY());
        }
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int[] readintarray(int n) {
            int res[] = new int[n];
            for (int i = 0; i < n; i++) res[i] = nextInt();
            return res;
        }

        long[] readlongarray(int n) {
            long res[] = new long[n];
            for (int i = 0; i < n; i++) res[i] = nextLong();
            return res;
        }
    }
}