import java.util.Scanner;

public class _009_x_to_the_power_n_M2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x : ");
        int x = sc.nextInt();
        System.out.println("enter the height of the stack : ");
        int h = sc.nextInt();
        long ans = calcPower(h, x);
        System.out.println(ans);
    }
    public static int calcPower(int n , int x ){
        if (n==1) {
            return x;
        }
        if (x==0) {
            return 0;
        }
        if (n%2==0) {
            int xpown = calcPower(n/2, x)*calcPower(n/2, x);
            return xpown;
        }
        else{
            int xpown = calcPower(n/2, x)*calcPower(n/2, x)* x ;
            return xpown;

        }

    }
}
