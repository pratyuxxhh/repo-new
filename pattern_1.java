import java.util.*;

public class pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter an odd number : ");
        int n = sc.nextInt();
        while (true) {
            if (n%2==0) {
                System.out.print("please enter only odd no. : ");
                n=sc.nextInt();
            } else {
                break;
            }   
        }
        int times = 0;
        for (int i = 1; i <= n; i++) {

            if (i <= (n / 2)) {
                for (int j = 1; j <= (int) Math.pow(2, i); j++) {
                    System.out.print("*");
                }
            } else if (i == (n + 1) / 2) {
                for (int j = 1; j <= (int) Math.pow(2, i); j++) {
                    System.out.print("*");
                }
            } else {
                times = times + 2;
                int z = i - times;
                for (int j = 0; j < (int) Math.pow(2, z); j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
