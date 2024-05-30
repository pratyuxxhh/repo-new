import java.util.*;
public class _006_factorical_with_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fac =1;
        factorial(n , fac );

    
    }
    public static void factorial(int n , int fac ){
        
        if (n==1) {
            System.out.println(fac);
            return;
        }
        fac *=n;
        factorial(n-1, fac);
        System.out.println(n);


    }
}
