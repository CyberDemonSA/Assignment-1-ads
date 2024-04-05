import java.util.Scanner;

public class ReverseOrderArrays {
    public static void reverseOrder(int n){
        Scanner sc = new Scanner(System.in);
        if (n >= 1){
            String a = sc.nextLine();
            reverseOrder(n-1);
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseOrder(n);
    }
}
