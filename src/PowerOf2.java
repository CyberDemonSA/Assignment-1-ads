import java.util.Scanner;

public class PowerOf2 {
    public static boolean isPowerOf2(int n, int p) {
        if (n == p) {return true;}
        if (n < p) {return false;}
        else{return isPowerOf2(n, p*2);}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPowerOf2(n, 1));
    }
}
