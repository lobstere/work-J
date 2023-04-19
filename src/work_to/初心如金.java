package work_to;

import java.util.StringTokenizer;
import java.io.*;
public class ³õÐÄÈç½ð {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader sc = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, sc, out);
        out.close();
    }
    static class Task {
        public void solve(int testNumber, InputReader sc, PrintWriter out) throws IOException {
            int n=sc.nextInt();
            long[] a=new long[n+1];
            for(int i=1;i<=n;i++)
                a[i]=sc.nextLong();
            for(int i=2;i<=n;i++) {
                if(a[i]%2==1)
                    out.println(0);
                else
                    out.println(1);
            }
        }
    }
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}