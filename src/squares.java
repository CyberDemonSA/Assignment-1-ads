import java.util.Scanner;

public class squares {
    public static int squares(int a) {
        if (a == 1){
            return 1;
        }
        else{
            return squares(a-1)+a*a;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(squares(a));
    }
}