import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            // Handle the current asteroid based on its direction
            if (asteroid > 0) {
                // Current asteroid is moving to the right (+ve direction)
                stack.push(asteroid);
            } else {
                // Current asteroid is moving to the left (-ve direction)
                // Check for collisions
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroid)) {
                    // Destroy the asteroid moving to the right
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() > 0 && stack.peek() == -asteroid) {
                    // Both asteroids explode
                    stack.pop(); // Destroy the asteroid from the stack
                } else if (stack.isEmpty() || stack.peek() < 0) {
                    // Current asteroid destroys all asteroids moving to the left on the stack
                    stack.push(asteroid);
                }
                // Otherwise, current asteroid moving to the left is destroyed
            }
        }

        // Convert stack to array for the final result
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}
