import java.util.*;
public class _001_stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("DAVKOYLANAFAR");
        sb.insert(3,' ');
        sb.insert(9,' ');

        System.out.println(sb);

        sb.setCharAt(12, 'G');
        System.out.println(sb);

        sb.append(" , DHANBAD");
        System.out.println(sb);
    }
}
