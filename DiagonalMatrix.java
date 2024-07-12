import java.util.*;

   // 1  2  3  4  5 
   // 6  7  8  9  10
   // 11 12 13 14 15 
   // 16 17 18 19 20

   // output 
   // 1
   // 6 2 
   // 11 7 3 
   // 16 12 8 4
   // 17 13 9 5
   // 18 14 10
   // 19 15
   // 20 

public class DiagonalMatrix{

   public static void main(String []args){
      int M[][] = {{ 1, 2, 3, 4,5 }, { 5, 6, 7, 8,6 },{ 9, 10, 11, 12,7 }, { 13, 14, 15, 16,8 }, { 17, 18, 19, 20,9 },}; 
      for (int i = 0; i < M.length; i++) {
         int currI = i;
         int currJ = 0;
         while (currI!=-1 && currJ!=M[0].length) {
            System.out.print(M[currI][currJ]+ " ");
            currI--;
            currJ++;

         }
         System.out.println();
         if(i==M.length-1){
            for (int j = 1; j < M[0].length; j++) {
               currI = M.length-1;
               currJ = j;
               while (currI!=-1 && currJ!=M[0].length) {
                  System.out.print(M[currI][currJ]+ " ");
                  currI--;
                  currJ++;
      
               }
               System.out.println();
            }
         }
      }
   }
}