import java.util.*;
public class pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length of the rectangle :");
        int len = sc.nextInt();
        System.out.print("enter breadth of the rectangle :");
        int bre = sc.nextInt();
   
        for (int i = 1; i <=bre; i++) {
            for (int j = 1; j <=len; j++) {
                if (i==1 || j==1 || i==bre||j==len) {
                    System.out.print("* ");
                    
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
}
// output : 
// enter length of the rectangle :5
// enter breadth of the rectangle :6
// * * * * * 
// *       * 
// *       * 
// *       * 
// *       * 
// * * * * * 
