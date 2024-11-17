import java.util.Stack;
public class NextGreaterElement {
    public static void printNextGreaterElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(stack.peek());
            }
            stack.push(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 2, 25};
        int[] arr2 = {13, 7, 6, 12};
        System.out.println("Next Greater Elements for arr1:");
        printNextGreaterElement(arr1);
        System.out.println("\nNext Greater Elements for arr2:");
        printNextGreaterElement(arr2);
    }
}
