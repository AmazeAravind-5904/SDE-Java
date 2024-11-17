import java.util.Arrays;
public class MaximumProductSubarray{
    static int SubArray(int[] arr){
        int a = arr[0];
        for(int i=0; i<arr.length; i++){
            int l=1;
            for(int j=i; j<arr.length; j++){
                l*=arr[j];
                a=Math.max(a,l);
            }
        }
        return a;
    }
    public static void main(String[] args){
        int[] arr = {-1, -3, -10, 0, 60};
        System.out.println("Max Product Subarray is "+SubArray(arr));
    }
}
