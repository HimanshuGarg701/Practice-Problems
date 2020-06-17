package BinarySearchQuestions;

public class SortedMatrix {
    public static void main(String[] args){
        int[][] matrix = {
                            {1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10,11,12},
                            {13,14,15,16},
                            {17,18,19,20}
                        };

        findNum(11, matrix);
    }

    private static void findNum(int num, int[][] matrix){
        int row = 0;
        int column = matrix[0].length-1;

        while(row <matrix.length && column>=0){
            if(matrix[row][column] == num){
                System.out.println("Element present in : " + row + " row and in : " + column + " column");
                break;
            }
            else if(num>matrix[row][column]){
                row++;
            }
            else if(num<matrix[row][column]){
                column--;
            }
        }
    }
}
