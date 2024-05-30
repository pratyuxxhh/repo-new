import java.util.Scanner;

public class _005_selection_sort {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter array size : ");
        int arrayLen = sc.nextInt();
        int []arr = new int[arrayLen];
        for (int i = 0; i < arrayLen; i++) {
            System.out.print("enter the "+i+"th element of array :");
            arr[i]=sc.nextInt();

        } 
        //selection sort 

        for (int i = 0; i < arrayLen; i++) {
            int smallest = arr[i];
            for (int j = i; j < arrayLen; j++) {
                int dummy=0;
                if (arr[j]<=smallest) {
                    
                    smallest = arr[j];
                    arr[j]=arr[i];
                    arr[i] = smallest;
                }

            }
            arr[i]=smallest;

            System.out.print(arr[i]+" ");
        }
    }
}
