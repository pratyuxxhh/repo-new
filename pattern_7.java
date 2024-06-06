import java.util.*;
public class pattern_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++) {
            int spaces = n-i;
            for (int j = 1; j <=spaces; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >0; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <=i; j++) {
                System.out.print(j);
            }
        System.out.println();
        }
    }
}
// output :
// n = 5

//     1    
//    212   
//   32123  
//  4321234 
// 543212345