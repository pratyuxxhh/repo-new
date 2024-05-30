import java.util.Scanner;

public class _010_reversing_a_string_by_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        revStr(str, str.length());

    }
    public static void revStr(String str , int n){
        if (n==0) {
            return;
        }
        System.out.print(str.charAt(n-1));
        revStr(str, n-1);
    }
}
