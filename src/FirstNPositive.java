import java.util.Scanner;

public class FirstNPositive {
    public static int firstNPositive(int[] arr, int n) {
        if (n == 0 && arr[n] > 0) {
            return arr[n];
        }
        if (arr[n] > 0) {
            return arr[n] + firstNPositive(arr, n - 1);
        }
        else{
            firstNPositive(arr, n - 1);
            return arr[n];
        }
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 8, 9};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(firstNPositive(a, n-1));
    }
}
