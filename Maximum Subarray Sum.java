import java.util.Arrays;
public class MaxSubarray{
    static int SubArray(int[] arr){
        int a = arr[0];
        for(int i=0; i<arr.length; i++){
            int l=0;
            for(int j=i; j<arr.length; j++){
                l+=arr[j];
                a=Math.max(a,l);
            }
        }
        return a;
    }
    public static void main(String[] args){
        int[] arr = {5, 4, 1, 7, 8};
        System.out.println("Maximum Sum of Subarray is "+SubArray(arr));
    }
}
