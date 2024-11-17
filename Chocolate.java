public class Chocolate{
    public static void main(String[] args) {
        int[] arr={7,3,2,4,9,12,56};
        int m=5;
        int a=Integer.MAX_VALUE;
        System.out.println();
        for (int i=0; i<=arr.length-m; i++){
            int x=Integer.MIN_VALUE, y=Integer.MAX_VALUE;
            for(int j=i;j<i+m;j++){
                x=Math.max(x,arr[j]);
                y=Math.min(y,arr[j]);
            }
            a=Math.min(a,x-y);
        }
        System.out.println("The difference is "+a);
    }
}