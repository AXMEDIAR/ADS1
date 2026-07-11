import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Task 1: Sum of Squares ===");
        System.out.print("Enter n: ");
        int n1 = sc.nextInt();
        System.out.println("Sum of squares: " + sumOfSquares(n1));

        System.out.println("\n=== Task 2: Sum of Array Elements ===");
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum of array: " + sumOfArray(arr, arr.length - 1));

        System.out.println("\n=== Task 3: Sum of Powers ===");
        System.out.print("Enter base b: ");
        int b = sc.nextInt();
        System.out.print("Enter power n: ");
        int n3 = sc.nextInt();
        System.out.println("Sum of powers: " + sumOfPowers(b, n3));

        System.out.println("\n=== Task 4: Reverse Sequence ===");
        System.out.print("Enter number of elements: ");
        int n4 = sc.nextInt();
        System.out.println("Enter elements:");
        reverseSequence(n4);
    }
    // ========== TASK 1 ==========
    // Sum of squares: 1² + 2² + ... + n²
    // Big-O: O(n) - linear time complexity
    // Explanation: Each recursive call does O(1) work, and we call it n times
    static int sumOfSquares(int n) {
        if (n == 0) {
            return 0;
        }
        return n * n + sumOfSquares(n - 1);
    }


    // ============ TASK 2 ============
    // Sum of first n elements of array
    // Big-O: O(n) - linear time complexity
    // Explanation: We process each element once, reducing index by 1 each call
    static int sumOfArray(int[] arr, int index) {
        if (index == 0) {
            return arr[0];
        }
        return arr[index] + sumOfArray(arr, index - 1);
    }

    // ============ TASK 3 ============
    // Sum of first n powers of base b: b⁰ + b¹ + b² + ... + bⁿ
    // Big-O: O(n) - linear time complexity
    // Explanation: We calculate n powers and make n recursive calls
    static int sumOfPowers(int b, int n) {
        if (n == 0) {
            return 1;
        }
        return (int) Math.pow(b, n) + sumOfPowers(b, n - 1);
    }

    // ============ TASK 4 ============
    // Display sequence in reverse order
    // Big-O: O(n) - linear time complexity
    // Explanation: We read n numbers and print them recursively in reverse
    static void reverseSequence(int n) {
        if (n == 0) {
            return;
        }
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        reverseSequence(n - 1);

        System.out.print(num + " ");
    }
}