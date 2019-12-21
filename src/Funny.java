import java.util.Scanner;
import java.util.stream.Stream;

public class Funny {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            input.nextLine();

            String integers = input.nextLine();
            int[] xs = Stream.of(integers.split(" ")).mapToInt(Integer::parseInt).toArray();

            for (int x : xs) {
                if ((x * x) % 2 == 0)
                    System.out.println((x * x) / 2);
                else
                    System.out.println("Can he do it? Cosecant!");
            }
        }
    }
}