import java.util.*;
public class SortedArray {
    public static int Array(int arr[], int k) {
        if (arr == null) {
            return -1;
        }
        int len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] == k) {
                return i;
            } 
            else {
                i = i + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Index position of the number is: " + Array(arr, 0));
    }
}
