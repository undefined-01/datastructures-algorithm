package algorithm.etc;

import java.util.Scanner;

public class etc10 {

    public static String solution(String str) {
        str += " ";

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for(int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i));
                if(count != 1) sb.append(count);

                count = 1;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(solution(scanner.next()));
    }
}
