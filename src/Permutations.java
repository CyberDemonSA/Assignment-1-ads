import java.util.Scanner;

public class Permutations {

    public static void generatePermutations(String input, String perm, int index) {
        if (index == input.length()) {
            System.out.println(perm);
            return;
        }

        cyclePermutations(input, perm, index, 0);
    }
    public static void cyclePermutations(String input, String perm, int index, int i) {
        if (i < input.length()) {
            if (perm.indexOf(input.charAt(i)) == -1) {
                generatePermutations(input, perm + input.charAt(i), index + 1);
            }
            cyclePermutations(input, perm, index, i + 1);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        generatePermutations(input, "", 0);
    }
}
