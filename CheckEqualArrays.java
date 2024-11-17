import java.util.Arrays;

class CheckEqualArrays{
    public static boolean equalArrays(int arr1[], int arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        if (n!=m){
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i=0; i<n; i++){
            if (arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr1[]={5,2,3,4,1};
        int arr2[]={1,2,3,4,5};
        if (equalArrays(arr1, arr2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}