import java.math.BigInteger;
import java.util.Scanner;

public class Linus {
    public static void main(String[] args) {

        // n is between 3000
        try (Scanner input = new Scanner(System.in)) {
            input.nextLine();
            String notes = input.nextLine();

            char[] c = notes.toCharArray();
            int n = notes.length();
            int div = n * n;
            String format = "%d/%d";

            int sum = 0;
            for (int l = 0; l < n; l++) {
                for (int s = 0; s < n; s++) {
                    int count = 0, curl = l, curs = s;
                    do {
                        curl++;
                        curs++;
                        count++;
                    } while (curl < n && curs < n && c[curl] == c[curs]);
                    sum += count;
                }
            }

            do {
                int gcd = gcd(div, sum);
                sum /= gcd;
                div /= gcd;
            } while (gcd(div, sum) != 1);

            System.out.println(String.format(format, sum, div));
        }
    }

    private static int gcd(int div, int sum) {
        return (toBI(sum).gcd(toBI(div))).intValue();
    }

    static BigInteger toBI(int num) {
        return new BigInteger(String.valueOf(num));
    }
}