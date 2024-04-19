package algorithm.etc;

import java.util.Scanner;

public class etc11 {

    public static String solution(int n, String str) {
        int len = str.length() / 7;
        StringBuilder decode = new StringBuilder();

        for(int i = 0; i < 7 * len; i += 7) {
            String encrypt = str.substring(i, i + 7);
            String binNum = encrypt.replaceAll("#", "1")
                                .replaceAll("\\*", "0");

            decode.append((char) Integer.parseInt(binNum, 2));
        }

        return decode.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        System.out.println(solution(n, str));
    }
}
