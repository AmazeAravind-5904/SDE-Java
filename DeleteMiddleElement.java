import java.util.Stack;

public class DeleteMiddleElement {
    public static void deleteMiddle(Stack<Integer> stack, int currentIndex, int middleIndex) {
        if (currentIndex == middleIndex) {
            stack.pop();
            return;
        }
        int top = stack.pop();
        deleteMiddle(stack, currentIndex + 1, middleIndex);
        stack.push(top);
    }
    public static void deleteMiddleElement(Stack<Integer> stack) {
        int middleIndex = stack.size() / 2;
        deleteMiddle(stack, 0, middleIndex);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Original Stack: " + stack);
        deleteMiddleElement(stack);
        System.out.println("Stack after deleting middle element: " + stack);
    }
}