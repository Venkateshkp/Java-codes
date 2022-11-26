package Backtracking;
import java.util.ArrayList;
public class MazeQ1 {
    public static void main(String args[]){
        // path("", 3, 3);
        // System.out.println(path1("", 3, 3));
        // System.out.println(pathDiagonals("", 3, 3));
        // int[][] maze = {{1,1,1}, {0,1,1}, {1,1,1}};
        // pathRestrictions("", maze, 0, 0);
        System.out.print(count(51,9));
    }
    static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = count(r-1, c);
        int right = count(r, c-1);
        return left+right;
    }
    static void path(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            path(p+'D', r-1, c);
        }
        if(c > 1){
            path(p+'R', r, c-1);
        }
    }
    static ArrayList<String> path1(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r > 1){
            list.addAll(path1(p+'D', r-1, c));
        }
        if(c > 1){
            list.addAll(path1(p+'R', r, c-1));
        }
        return list;
    }
    static ArrayList<String> pathDiagonals(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1 && c>1){
            list.addAll(pathDiagonals(p+'D', r-1, c-1));
        }
        if(r > 1){
            list.addAll(pathDiagonals(p+'V', r-1, c));
        }
        if(c > 1){
            list.addAll(pathDiagonals(p+'H', r, c-1));
        }
        return list;
    }
    static void pathRestrictions(String p, int[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[r][c] == 0){
            return;
        }
        if(r < maze.length-1){
            pathRestrictions(p+'D', maze, r+1, c);
        }
        if(c < maze[0].length-1){
            pathRestrictions(p+'R', maze, r, c+1);
        }
    }
}
 