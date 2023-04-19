 package ac_nowcoder;

import java.io.*;
import java.util.*;

 public class ÖÇ¶·¶ñÁú2 {
     static int  n,m,sx,sy,d,x,dx[]= {0,1,0,-1},dy[]= {1,0,-1,0};
     static long map[][];
     static TreeSet<Long> tree;
     static class pair{
         int x,y;
         long d;
         pair(int a,int b,long c){
             this.x=a;
             this.y=b;
             this.d=c;
         }
     }
     static boolean flag[][];
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         PrintWriter out =new PrintWriter(new OutputStreamWriter(System.out));
         Scanner scan=new Scanner(System.in);
         int t= Integer.parseInt(br.readLine());
         while(t-->0) {
             n=scan.nextInt();m=scan.nextInt();sx=scan.nextInt();sy=scan.nextInt();d=scan.nextInt();x=scan.nextInt();
             map=new long[n][m];
             flag=new boolean[n][m];
             tree=new TreeSet<Long>();
             for(int i=0;i<n;i++) {
                 for(int j=0;j<m;j++) {
                     map[i][j]=scan.nextLong();
                 }
             }
             if(map[sx-1][sy-1]==-1) {
                 out.println("no");
                 continue;
             }
             bfs();
             if(tree.size()>=x) {
                 long ans=Long.MAX_VALUE;
                 Vector<Long> v= new Vector<>(tree);
                 for(int i=0,j=i+x-1;j<tree.size();i++,j++){
                     ans=Math.min(ans,v.get(j)-v.get(i));
                 }
                 if(ans==Long.MAX_VALUE)out.println("no");
                 else out.println(ans);
             }
             else out.println("no");
         }
         scan.close();
         out.flush();
     }
     public static void bfs() {
         Queue<pair> que= new LinkedList<>();
         que.add(new pair(sx-1,sy-1,0));
         flag[sx-1][sy-1]=true;
         while(que.size()>0) {
             pair p=que.poll();
             if(map[p.x][p.y]!=0&&map[p.x][p.y]!=-1) {
                 tree.add(map[p.x][p.y]);
             }
             for(int i=0;i<4;i++) {
                 int nx=p.x+dx[i],ny=p.y+dy[i];
                 if(nx>=0&&nx<n&&ny>=0&&ny<m&&map[nx][ny]!=-1&&!flag[nx][ny]&&p.d<d) {
                     que.add(new pair(nx,ny,p.d+1));
                     flag[nx][ny]=true;
                 }
             }
         }
     }
 }