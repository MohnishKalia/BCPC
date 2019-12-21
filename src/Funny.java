import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class Funny {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // catch int input and remove buffer
            input.nextInt();
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

    private ByteArrayInputStream inContent;
    private ByteArrayOutputStream outContent;

    @Test
    public void testFunny_Givens() {
        String[] inputlns = { "3", "4 5 0" };
        String[] outputlns = { "8", "Can he do it? Cosecant!", "0" };
        
        outContent = new ByteArrayOutputStream();
        inContent = new ByteArrayInputStream(String.join("\n", inputlns).getBytes());
        System.setIn(inContent);
        System.setOut(new PrintStream(outContent));
        
        main(null);
        assertEquals(String.join("\r\n", outputlns) + "\r\n", outContent.toString());
    }
}