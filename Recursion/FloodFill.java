package Recursion;

public class FloodFill {
    public static void main(String[] args){
        int[][] maze = {
                {0,1,0,0,0,0,0},
                {0,1,0,1,1,1,0},
                {0,0,0,0,0,0,0},
                {1,0,1,1,0,1,1},
                {1,0,1,1,0,1,1},
                {1,0,0,0,0,0,0}

        };

        boolean[][] visited = new boolean[maze.length][maze[0].length];
        printPaths(maze, 0, 0, visited, "");
    }

    public static void printPaths(int[][] maze, int sr, int sc, boolean[][] visited, String path){
        if(sr<0 || sc<0 || sr>=maze.length || sc>= maze[0].length || maze[sr][sc]==1 ||visited[sr][sc]){
            return;
        }

        if(sr==maze.length-1 && sc==maze[0].length-1){
            System.out.println(path);
            return;
        }

        visited[sr][sc] = true;
        printPaths(maze, sr+1, sc, visited, path+"d");
        printPaths(maze, sr, sc+1, visited, path+"r");
        printPaths(maze, sr-1, sc, visited, path+"u");
        printPaths(maze, sr, sc-1, visited, path+"l");
        visited[sr][sc] = false;

    }
}
