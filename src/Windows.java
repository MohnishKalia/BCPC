import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Windows {
    private static String[] unwanted;

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            input.nextLine();
            unwanted = input.nextLine().split(" ");
            int iter = input.nextInt();
            List<String> iterations = LongStream.iterate(1, i -> i + 1).mapToObj(String::valueOf).filter(Windows::isFine)
                    .limit(iter).collect(Collectors.toList());
            System.out.println(iterations.get(iter-1));
        }
    }

    static boolean isFine(String input) {
        for (String s : unwanted)
            if (input.contains(s))
                return false;
        return true;
    }
}