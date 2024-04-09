import java.util.Scanner;

public class RevereOrder {
    public static void reverseOrder(int n, Scanner sc){
        if (n != 0){
            int a = sc.nextInt();
            reverseOrder(n-1, sc);
            System.out.print(a + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseOrder(n, sc);
    }
}
