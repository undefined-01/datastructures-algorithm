package recursive;

import java.util.Scanner;

public class EuclidGCD {

    static int gcd(int x, int y) {
        if(y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println("gcd = " + gcd(x, y));
    }
}
