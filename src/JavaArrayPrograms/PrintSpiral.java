package JavaArrayPrograms;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
/*
 Print the matrix in spiral order
 */
public class PrintSpiral {
    static void printMatrix(int[][] matrix){
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j< matrix.length;j++){
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void printSpiralOrder(int[][] matrix,int r,int c) {
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalElements=0;
        while (totalElements<r*c) {
            //topRow=leftCol to rightCol
            for (int j = leftCol; j <= rightCol; j++) {
                System.out.println(matrix[topRow][j]);
                totalElements++;
            }
            topRow++;
            //rightCol=topRow to bottomRow
            for (int i = topRow; i <= bottomRow; i++) {
                System.out.println(matrix[i][rightCol]);
                totalElements++;
            }
            rightCol--;
            //bottomRow=rightCol to leftCol
            for (int j = rightCol; j >= leftCol; j--) {
                System.out.println(matrix[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;
            //leftCol=bottomRow to topRow
            for (int i = bottomRow; i >= topRow; i--) {
                System.out.println(matrix[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
         }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows" +
                " and columns");
        int r=sc.nextInt();
        int c=sc.nextInt();

        int[][]matrix=new int[r][c];
        int total=r*c;
        System.out.println("Enter " + total + " values ");

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);

        System.out.println("Spiral Order");
        printSpiralOrder(matrix,r,c);
    }
}
