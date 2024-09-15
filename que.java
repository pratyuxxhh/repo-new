import java.util.Scanner;

public class que {

    public static int pairs(int n){
        if(n==1){
            return 1;
        }
        int x = n *pairs(n-1);

        return x;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(pairs(n));
        
    }
}