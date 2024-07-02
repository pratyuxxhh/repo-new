import java.util.ArrayList;
import java.util.Collections;

public class Collectionss {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(9);
        list.add(5);
        list.add(2);
        list.add(3);
        // System.out.println(Collections.frequency(list, 9));
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
        Collections.swap(list, 1, 2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        
    }
}
