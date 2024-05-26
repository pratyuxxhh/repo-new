import java.util.*;
public class _002_reversing_a_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you string : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        for (int i = 0; i < sb.length()/2; i++) {
            // empty code
            char front = sb.charAt(i);
            char back  = sb.charAt(sb.length()-1-i);

            sb.setCharAt(i, back);
            sb.setCharAt(sb.length()-1-i, front);
        }

        System.out.println(sb);
    }
}
