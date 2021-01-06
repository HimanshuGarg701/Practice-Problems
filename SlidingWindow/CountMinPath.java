package SlidingWindow;

public class CountMinPath {
    public static void main(String[] args){
        int[][] matrix = new int[30][30];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j] = Integer.MAX_VALUE;
            }
        }
        int[] count = new int[1];
        count[0] = Integer.MAX_VALUE;
        findMinPath(matrix, 0, 0, 29,29, count, 0);

        if(count[0]==Integer.MAX_VALUE){
            System.out.println("No Path");
        }else{
            System.out.println(count[0]);
        }
    }

    public static void findMinPath(int[][] matrix, int startX, int startY, int targetX, int targetY, int[] count, int current){
        if(startX<0 || startY<0 || startX>=matrix.length || startY>=matrix.length || current>= matrix[startX][startY]){
            return;
        }
        if(startX==targetX && startY==targetY){
            count[0] = Math.min(count[0], current);
            return;
        }

        matrix[startX][startY] = current;
        findMinPath(matrix, startX-2, startY+1, targetX, targetY, count, current+1);
        findMinPath(matrix, startX-2, startY-1, targetX, targetY, count, current+1);
        findMinPath(matrix, startX+2, startY+1, targetX, targetY, count, current+1);
        findMinPath(matrix, startX+2, startY+1, targetX, targetY, count, current+1);
        findMinPath(matrix, startX-1, startY+2, targetX, targetY, count, current+1);
        findMinPath(matrix, startX-1, startY-2, targetX, targetY, count, current+1);
        findMinPath(matrix, startX+1, startY+2, targetX, targetY, count, current+1);
        findMinPath(matrix, startX+1, startY+-2, targetX, targetY, count, current+1);
       // matrix[startX][startY] = Integer.MAX_VALUE;
    }
}
