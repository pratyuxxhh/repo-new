import java.util.*;
public class basic_calc {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("enter first number :");
            int a= sc.nextInt();
            System.out.println("enter 2nd no. : ");
            int b = sc.nextInt();
            float ans;
            System.out.println("enter the operation:");
            String operation = sc.next();

            
            switch (operation) {
                case "add":
                    ans = a+b ;
                    System.out.println(ans);
                    break;
                case "multiply":
                    ans = a*b ;
                    System.out.println(ans);
                    break;
                case "divide":
                    ans = a/b ;
                    System.out.println(ans);
                    break;
                case "subtract":
                    ans = a-b ;
                    System.out.println(ans);
                    break;
                case "modulus":
                    ans = a%b ;
                    System.out.println(ans);
                    break;
            
                default:
                    break;
            }    
        }
        
    }
}
