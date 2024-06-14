import java.util.LinkedList;
import java.util.Scanner;

public class _021_LinkedList_que {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int len = 5;
        for (int i = 0; i < len; i++) {
            list.add(sc.nextInt());

        }
        System.out.println(list);
        for (int i = 0; i <len; i++) {
            if (list.get(i)>25) {
                list.remove(i);
                len--;
                i--;
            }
        }
        System.out.println(list);
    }

}
