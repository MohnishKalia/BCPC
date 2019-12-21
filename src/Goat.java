import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Goat {
    public static void main(String[] args) {
        yes();
    }

    private static void mohnish() {
        try (Scanner input = new Scanner(System.in)) {
            int obsC = input.nextInt();
            input.nextLine();
            List<Integer> obstacles = new ArrayList<>();
            for (int i = 0; i < obsC; i++) {
                obstacles.add(input.nextInt());
            }
            int queryCount = input.nextInt();
            input.nextLine();
            long sum = 0;
            for (int i = 0; i < queryCount; i++) {
                long num1 = input.nextInt();
                long num2 = input.nextInt();
                sum += obstacles.stream().filter(num -> num > num1 && num < num2).count();
            }
            System.out.println(sum);
        }
    }

    public static void yes() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] obs = new int[n];
        for (int i = 0; i < n; i++) {
            obs[in.nextInt()]++;
        }
        int q = in.nextInt();
        int[] field = new int[1000001];
        for (int i = 0; i < q; i++) {
            field[in.nextInt()] += 1;
            field[in.nextInt()] -= 1;
        }
        for (int i = 1; i < 1000001; i++) {
            field[i] += field[i - 1];
        }
        int sum = 0;
        for (int i : obs) {
            sum += field[i];
        }
        System.out.println(sum);
    }

}