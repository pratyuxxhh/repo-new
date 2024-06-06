import java.util.Scanner;

public class _015_keyPadCombination {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number (more than single digit ): ");
        String str = sc.next();
        keyPadCombo(str , 0 , "",0);

    }
    public static void keyPadCombo(String str , int index , String newStr, int subStringIndex){
        
        char currentInt = str.charAt(index);
        int keypadId = currentInt-'0';
        char currentChar = keypad[keypadId].charAt(subStringIndex);

        for (int i = index; i < keypad[keypadId].length(); i++) {
            
        }

    }
}
// print the possible combinations of alphabets on given number.
