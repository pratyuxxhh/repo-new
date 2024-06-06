import java.util.Scanner;

public class _014_deletingDuplicate {

    public static Boolean charStatus[] = { false, false, false, false, false,
            false, false, false, false, false,
            false, false, false, false, false,
            false, false, false, false, false,
            false, false, false, false, false, false };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string(no spaces in between) : ");
        String str = sc.nextLine();
        String newStr = "";
        remDuplicate(str, 0, newStr);

    }

    public static void remDuplicate(String str, int index, String newString) {
        if (index == str.length()-1) {
            System.out.println(newString);
            return;
        }
        char curChar = str.charAt(index);
        int charPosition = 'z' - curChar;
        if (charStatus[charPosition] == false) {
            newString += curChar;
            charStatus[charPosition] = true;
            remDuplicate(str, index + 1, newString);
        } else {
            remDuplicate(str, index + 1, newString);
        }

    }
}
// remove duplicate alphabets from string

