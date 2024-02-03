package algorithm.etc;

import java.util.Scanner;

public class etc07 {
    public static void main(String[] args) {

        etc07 main = new etc07();
        Scanner scanner = new Scanner(System.in);

        String originStr = scanner.next();

        System.out.println(main.solution(originStr));
    }

    public String solution(String str) {

        str = str.toLowerCase();

        int lt = 0;
        int rt = str.length() - 1;
        String result = "YES";

        while (lt < rt) {

            if (str.charAt(lt) != str.charAt(rt)) {
                result = "NO";
                break;
            }

            lt++;
            rt--;
        }

        return result;
    }

    public String solution2(String str) {

        str = str.toLowerCase();

        String result = "YES";

        for(int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                result = "NO";
                break;
            }
        }

        return result;
    }

    public String solution3(String str) {

        String result = "YES";
        String reverse = new StringBuilder(str).reverse().toString();

        if(!str.equalsIgnoreCase(reverse)) result = "NO";

        return result;
    }
}
