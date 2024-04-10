import java.util.Scanner;

public class PowerOf2Enhanced {
    public static boolean isPowerOf2(float n) {
        if (n == 1) {return true;}
        if (n < 1) {return false;}
        else{return isPowerOf2(n/2);}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        System.out.println(isPowerOf2(n));
    }
}
