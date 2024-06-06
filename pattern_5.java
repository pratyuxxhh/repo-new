import java.util.*;
public class pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of rhombus : " );
        int len = sc.nextInt();
        for (int i = 1; i <=len; i++) {
            int spaces = len-i;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
                
            }
            for (int j = 0; j < len; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
// output : 
// 5
//     *  *  *  *  *  
//    *  *  *  *  *   
//   *  *  *  *  *    
//  *  *  *  *  *     
// *  *  *  *  *    
