import java.util.LinkedList;
import java.util.Scanner;

public class _022_reversingALinkedList {
    public static void rev (int index , int size , LinkedList<Integer> list){
        if (index == size/2) {
            System.out.println("reversed list : "+list); 
            return;
        }
        int dummy = 0 ;
        dummy = list.get(size-index -1 );
        list.set(size-index -1 , list.get(index));
        list.set(index,dummy);
        rev(index+1,size , list);
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int listSize = sc.nextInt();
        for (int i = 0; i < listSize; i++) {
            list.addLast(sc.nextInt());
        }
        System.out.println("original list : "+list);
        rev(0, listSize,list);
    }
}
