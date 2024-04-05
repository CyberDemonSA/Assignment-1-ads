import java.util.Scanner;

public class SumOfArray {
    public static int sumOfArray(int[] arr, int n) {
        if (n==0){
            int b = arr[0];
            return b;
        }
        else{
            return arr[n]+ sumOfArray(arr, n-1);
        }
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 8, 9};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfArray(a, n-1));
    }
}
