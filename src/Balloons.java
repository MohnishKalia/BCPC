import java.util.Scanner;
import java.util.stream.IntStream;

public class Balloons {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int L = input.nextInt();
            int H = input.nextInt();
            int T = input.nextInt();

            int[] bals = new int[n];

            for (int i = 0; i < bals.length; i++) {
                bals[i] = T - i >= 0 ? T - i : 0;
            }

            long sum = IntStream.of(bals).filter(height -> height >= L && height <= H).count();
            System.out.println(sum);
        }
    }
}