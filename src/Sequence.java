import java.util.Scanner;

public class Sequence {
    public static void sequence1(int n, int k, int[] a){
        if (a[0]!=k || a[1]!=k || a[n-1]!=k){
            a[n-1]++;
            if (a[n-1]==k+1){
                sequence2(n, k, n, a);
            }
            printSequence(n, a);
            System.out.println();
            sequence1(n, k, a);
        }
    }
    public static void sequence2(int n, int k, int l, int[] a){
        if (l != 0){
            if (a[l-1]==k+1){
                a[l-1]=1;
                a[l-2]++;
            }
            if (a[n-1]==k+1){
                a[n-1]=0;
                a[n-2]++;
            }
            sequence2(n, k, l-1, a);
        }
    }
    public static int[] sequence(int n, int[] a){
        if (n == 0){
            return a;
        }
        else{
            a[n-1] = 1;
            return sequence(n-1, a);
        }
    }
    public static void printSequence(int n, int[] a){
        if (n != 0){
            printSequence(n-1, a);
            System.out.print(a[n-1] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        a = sequence(n, a);
        a[n-1] = 0;
        sequence1(n, k, a);
    }
}
