public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
        System.out.println(maxArea(new int[] {1,1}));
    }

    public static int maxArea(int[] height) {
        int pointerL = 0, pointerR = height.length - 1;
        int maxArea = 0;

        while (pointerL < pointerR) {
            int diffOfX = pointerR - pointerL;

            int minLengthContainer = Math.min(height[pointerL], height[pointerR]);

            int area = minLengthContainer * diffOfX;

            if (area > maxArea) {
                maxArea = area;
            }

            if (height[pointerL] > height[pointerR]) {
                pointerR--;
            } else {
                pointerL++;
            }
        }

        return maxArea;
    }
}
