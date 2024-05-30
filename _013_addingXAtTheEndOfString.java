import java.util.Scanner;

public class _013_addingXAtTheEndOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string containing x : ");
        String str = sc.nextLine();
        newString(str,0,"",0);
    }
    public static void newString(String str , int index, String string, int count){

        if (index==str.length()) {
            for (int i = 0; i < count; i++) {
                string+='x';

            }
            System.out.println(string);
            return;
        }
       char c = str.charAt(index);
       if (c=='x') {
            count++;
            newString(str, index+1, string, count);
       }else{
        string+=c;
        newString(str, index+1, string, count);
    }
    }
}
