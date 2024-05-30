import java.util.Scanner;
public class _008_x_to_the_power_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x : ");
        int x = sc.nextInt();
        System.out.println("enter the height of the stack : ");
        int h = sc.nextInt();
        long ans = power(h, x);
        System.out.println(ans);
    }
    public static int power(int h, int x) {
        if (h == 1) {
            return x;
        }
        if (x == 0) {
            return 0;
        }
        int xpownm1 = power(h - 1, x);
        int xpown = x * xpownm1;
        return xpown;
    }
}
