import java.util.Stack;

public class AsteroidCollision {

    public static void main(String[] args) {
        // var asteroids = asteroidCollision(new int[] { 5, 10, -5 });
        // var asteroids = asteroidCollision(new int[] { 8, -8 });
        var asteroids = asteroidCollision(new int[] { 10, 2, -5 });
        //var asteroids = asteroidCollision(new int[] { -2, -1, 1, 2 });

        System.out.print("[");
        for (int i = 0; i < asteroids.length - 1; i++) {
            System.out.print(asteroids[i] + ", ");
        }
        if (asteroids.length > 0) {
            System.out.print(asteroids[asteroids.length - 1] + "]");
        } else {
            System.out.print("]");
        }
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            boolean destroyed = false;
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (Math.abs(asteroid) > Math.abs(stack.peek())) {
                    stack.pop();
                } else if (Math.abs(asteroid) == Math.abs(stack.peek())) {
                    stack.pop();
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }
            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}
