import java.util.LinkedList;
import java.util.Scanner;

public class _020_LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        String mirror = "M" ;
        list.add(mirror);
        System.out.println("enter the distance of object from mirror : ");
        int dist = sc.nextInt();
        for (int i = 1; i < dist; i++) {
            list.addFirst(" ");
            list.addLast(" ");
        }
        list.addFirst("O");
        list.addLast("I");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        
    }
}
