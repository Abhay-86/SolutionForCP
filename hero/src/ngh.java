
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class ngh {
    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException {
            din = new DataInputStream(
                    new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException {
            byte[] buf = new byte[64];
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') {
                    if (cnt != 0) {
                        break;
                    } else {
                        continue;
                    }
                }
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0,
                    BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException {
            if (din == null)
                return;
            din.close();
        }
    }

    public static void main(String[] args)
            throws IOException {
        Reader s = new Reader();
        int g = s.nextInt();
        int arr1[] = new int[g];
        for (int t = 0; t < g; t++) {
            String sa = s.readLine();
            String arr4[] = sa.split(" ");
            int m = Integer.parseInt(arr4[0]);
            int n = Integer.parseInt(arr4[1]);
            int c = Integer.parseInt(arr4[2]);
            int l = Math.min(m, n);
            int arr[][] = new int[m][n];
            int d = 0;
            for (int i = 0; i < m; i++) {
                String se = s.readLine();
                String arr5[] = se.split(" ");
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(arr5[j]);
                    if (arr[i][j] >= c) {
                        d += 1;
                    }
                }
            }
            int b = 0;
            for (int i = 2; i < l + 1; i++) {
                b = sum(arr, l, i, m, n, c) + b;
            }
            arr1[t] = b + d;
        }
        for (int i=0;i<g;i++)
        {
            System.out.println(arr1[i]);
        }
    }

    static int sum(int[][] arr, int l, int k, int m, int n, int c) {
        int arr2[][] = new int[m][n];
        int arr1[][] = new int[m][n];
        if (k <= l) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int sum1 = 0;
                    for (int a = j; a < k + j; a++) {
                        sum1 = arr[i][a] + sum1;
                    }
                    arr1[i][j] = sum1;
                    if (j == n - k) {
                        break;
                    }
                }
            }
            int sum3 = 0;
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < m; i++) {
                    int sum2 = 0;

                    for (int a = i; a < k + i; a++) {
                        sum2 += arr1[a][j];
                    }
                    if (sum2 / (k * k) >= c) {
                        sum3 += 1;
                    }
                    arr2[i][j] = sum2;
                    if (i == m - k) {
                        break;
                    }
                }
            }
            return sum3;
        } else {
            return 0;
        }
    }
}

