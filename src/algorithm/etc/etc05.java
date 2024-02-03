package algorithm.etc;

import java.util.Scanner;

public class etc05 {
    public static void main(String[] args) {

        etc05 main = new etc05();
        Scanner scanner = new Scanner(System.in);

        String originStr = scanner.next();

        System.out.println(main.solution(originStr));
    }

    public String solution(String str) {

        int lt = 0;
        int rt = str.length() - 1;
        char[] reverse = str.toCharArray();

        while (lt < rt) {

            boolean isLtAlphabet = Character.isAlphabetic(reverse[lt]);
            boolean isRtAlphabet = Character.isAlphabetic(reverse[rt]);

            if (isLtAlphabet && isRtAlphabet) {

                char temp = reverse[lt];
                reverse[lt] = reverse[rt];
                reverse[rt] = temp;

                lt++;
                rt--;

            } else if (!isLtAlphabet && isRtAlphabet) {
                lt++;
            } else if (isLtAlphabet && !isRtAlphabet) {
                rt--;
            } else {
                lt++;
                rt--;
            }

        }

        return String.valueOf(reverse);
    }

}
