package ac_nowcoder;

import java.io.*;
import java.util.*;

public class ÖÇ¶·¶ñÁú3 {
        static class Node {
        int st, x, y;
        Node(int x, int y, int st) {
            this.x = x;
            this.y = y;
            this.st = st;
        }
    }
    public static void main(String[] args) throws IOException {
        int t = nextInt();
        StringBuffer sb = new StringBuffer();
        int n, m, sx, sy, d, x;
        int[] stX = { 1, -1, 0, 0 };
        int[] stY = { 0, 0, -1, 1 };
        HashSet<Long> set = new HashSet<>();
        while (t != 0) {
            t--;
            n = nextInt();
            m = nextInt();
            sx = nextInt();
            sy = nextInt();
            d = nextInt();
            x = nextInt();
            set.clear();
            long[][] data = new long[n + 1][m + 1];
            for (int i = 1; i <= n; i++)
                for (int j = 1; j <= m; j++)
                    data[i][j] = nextLong();
            if (data[sx][sy] == -1) {
                sb.append("no\n");
                continue;
            }
            boolean[][] visit = new boolean[n + 1][m + 1];
            ArrayDeque<Node> q = new ArrayDeque<>();
            ArrayList<Long> list = new ArrayList<>();
            q.add(new Node(sx, sy, 0));
            visit[sx][sy] = true;
            if (data[sx][sy] != 0) {
                set.add(data[sx][sy]);
                list.add(data[sx][sy]);
            }
            while (!q.isEmpty()) {
                Node node = q.poll();
                if (node.st >= d)
                    break;
                for (int i = 0; i < 4; i++) {
                    int tx = node.x + stX[i];
                    if (tx < 1 || tx > n)
                        continue;
                    int ty = node.y + stY[i];
                    if (ty < 1 || ty > m)
                        continue;
                    if (visit[tx][ty] || data[tx][ty] == -1)
                        continue;
                    visit[tx][ty] = true;
                    if (data[tx][ty] != 0) {
                        if (!set.contains(data[tx][ty])) {
                            list.add(data[tx][ty]);
                            set.add(data[tx][ty]);
                        }
                    }
                    q.add(new Node(tx, ty, node.st + 1));
                }
            }
            if (set.size() >= x) {
                Collections.sort(list);
                long min = Long.MAX_VALUE;
                for (int i = x - 1; i < list.size(); i++)
                    min = Math.min(min, list.get(i) - list.get(i - x + 1));
                sb.append(min + "\n");
            } else
                sb.append("no\n");
        }
        System.out.println(sb);
    }
    static StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    static int nextInt() throws IOException {
        st.nextToken();
        return (int) st.nval;
    }
    static double nextDouble() throws IOException {
        st.nextToken();
        return st.nval;
    }
    static long nextLong() throws IOException {
        st.nextToken();
        return (long) st.nval;
    }
}