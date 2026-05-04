
import java.util.*;

public class Problem2 {

    public static int minOperations(int[] arr, int k) {
        int n = arr.length;

        Arrays.sort(arr);

        int target = arr[n / 2];

        int operations = 0;

        for (int i = 0; i < n; i++) {
            int diff = Math.abs(arr[i] - target);

            if (diff % k != 0) {
                return -1;
            }

            operations += diff / k;
        }

        return operations;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(minOperations(arr, k));
    }
}
