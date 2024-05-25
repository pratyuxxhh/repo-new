import java.util.*;
public class pattern_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            int spaces = n-i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
