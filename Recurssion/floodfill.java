import java.io.*;
import java.util.*;

public class floodfill {

    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        int[][] dir={{0,1},{-1,0},{0,-1},{1,0}};
        boolean vis[][]=new boolean[n][m];
        String [] dirS={"r","t","l","d"};
        for(int i = 0; i < n; i++){
            for(int j = 0;j < m; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        floodfill1(arr,0,0,n,m,"",vis,dir,dirS);
    }

    public static void floodfill1(int[][] maze,int sr,int sc, int row, int col, String ans, boolean[][] visited,int[][] dir,String[] dirS) {
        if (sr==row-1&& sc==col-1){
            System.out.println(ans);
            return;
        }
        visited[sr][sc]=true;
        for(int d=0;d<dir.length;d++){
            int r= sr+ dir[d][0];
            int c= sc+ dir[d][1];
            
           if(r >=0 && c >=0 && r < row && c < col && maze[r][c]!=1 && !visited[r][c]){
               floodfill1(maze, r, c, row, col, ans+dirS[d], visited, dir , dirS);
           }
        }
        visited[sr][sc]=false;
        return;
    }
}