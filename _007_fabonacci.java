import java.util.Scanner;

public class _007_fabonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of terms : ");
        int n = sc.nextInt();
        int b =1;
        System.out.print("0 ");
        System.out.print("1 ");
        fabo( n , 0 , b);
    }
    
    public static void fabo(int n , int a , int b ){
        if (n==2) {
            return;
        }  
        int sum = a +b ;
        System.out.print(sum+" ");
        fabo(n-1,b,sum);
    }
}
