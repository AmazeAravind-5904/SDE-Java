public class Containerwithmostwater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 4, 3};
        int[] arr2 = {3, 1, 2, 4, 5};
        System.out.println("Max Area for arr1: " + maxArea(arr1));
        System.out.println("Max Area for arr2: " + maxArea(arr2));
    }
}