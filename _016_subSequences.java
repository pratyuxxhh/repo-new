import java.util.Scanner;

public class _016_subSequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");   // abc
        String str = sc.next();
        subSequence(str , 0,"");
    }
    public static void subSequence(String str , int index , String newString){
        if (index==str.length()) {
            System.err.println(newString);
            return;
        }
        char currentChar = str.charAt(index);
        subSequence(str, index+1, newString+currentChar);
        subSequence(str, index+1, newString);
    }
}
