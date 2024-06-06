import java.util.*;
public class TwoD_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // enter size of row and column
        int row =sc.nextInt();   
        int col = sc.nextInt();
        int [][] Array = new int[row][col]; 


        // to find a number from 2D matrix

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("enter ("+i+" , "+j+") : ");
                Array[i][j]= sc.nextInt();
            }
            
        }  
        System.out.println("enter the no. to find :");
        int num =sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (Array[i][j]==num) {
                    System.out.println("("+i+" , "+j+")");
                }
            }
            
        }    

    }
}
