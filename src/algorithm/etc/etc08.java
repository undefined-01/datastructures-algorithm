package algorithm.etc;

import java.util.Scanner;

public class etc08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(solution(scanner.next()));
    }

    public static Integer solution(String str) {
        String result = "";

        for(char ch : str.toCharArray()) {
            if(Character.isDigit(ch)) result += ch;
        }

        return Integer.parseInt(result);
    }

    public static Integer solution2(String str) {
        int result = 0;

        for(char ch : str.toCharArray()) {
            if(ch >= 48 && ch <= 57) result = result * 10 + (ch - 48);
        }

        return result;
    }
}
