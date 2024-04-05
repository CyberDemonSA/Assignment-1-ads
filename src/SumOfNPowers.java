import java.util.Scanner;

public class SumOfNPowers {
    public static int powersOfN(int b, int n) {
        if (n == 0) return 1;
        else{
            return b * powersOfN(b, n - 1);
        }
    }
    public static int sumOfNPowers(int b, int n) {
        if (n == 0) return powersOfN(b, n);
        else{
            return powersOfN(b, n) + sumOfNPowers(b, n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sumOfNPowers(a, b));
    }
}