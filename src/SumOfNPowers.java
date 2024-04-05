import java.util.Scanner;

public class SumOfNPowers {
    public static int sumOfNPowers(int b, int n, int s ) {
        if (n == 0) return 1;
        else{
            System.out.println(b);
            s = s + b;
            b = b * sumOfNPowers(b, n - 1, s);
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sumOfNPowers(a, b, 1));
    }
}