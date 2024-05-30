public class _012_cheking_sorted_array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 9, 18, 18 };  //you can change the array according to your case . 
        Boolean ans = check(arr, 0);
        System.out.println(ans);
    }

    public static Boolean check(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] < arr[i + 1]) {
            return check(arr, i + 1);
            
        } else {
            return false;

        }
    }
}
