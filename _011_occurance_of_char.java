import java.util.Scanner;

public class _011_occurance_of_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = sc.nextLine();
        int index = 0 ;
        System.out.println("find occurance of char : ");
        String c = sc.next();
        while (c.length()!=1) {
            System.out.println("please enter single alphabet : ");
            c= sc.next();
        }
        Occurance(str , index ,c);

    }
    public static void Occurance(String str , int i , String c){
        if (i==str.length()-1) {
            return ;
        }
        if (str.charAt(i)==c.charAt(0)) {
            System.out.println(c+" occurs at "+(i+1)+"th position.");
        }
        Occurance(str, i+1, c);
    }
}
