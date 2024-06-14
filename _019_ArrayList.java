import java.util.ArrayList;
import java.util.Scanner;

public class _019_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int sum =0;
        int classHighest=0;
        int index=0;
        System.out.println("enter total no. of student in class : ");
        int student= sc.nextInt();
        for (int i = 0; i < student; i++) {
            System.out.println("enter total marks of "+i+"th student : ");
            list.add(sc.nextInt());
            sum+=list.get(i);
            if (list.get(i)>classHighest) {
                classHighest = list.get(i);
                index = i;
            }

        }
        System.out.println("class average : "+(float)sum/student);
        System.out.println(index+1+"th student got highest marks : "+classHighest);
    }
}
