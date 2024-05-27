import java.util.*;
public class _004_bubble_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size : ");
        int arrayLen = sc.nextInt();
        int []arr = new int[arrayLen];
        for (int i = 0; i < arrayLen; i++) {
            System.out.print("enter the "+i+"th element of array :");
            arr[i]=sc.nextInt();

        } 
        
        for (int i = 0; i < arrayLen-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int dummy=0;
                    dummy = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]= dummy;
                }
            }
        }
        for (int i = 0; i < arrayLen; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
