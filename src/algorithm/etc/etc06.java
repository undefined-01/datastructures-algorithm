package algorithm.etc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class etc06 {
    public static void main(String[] args) {

        etc06 main = new etc06();
        Scanner scanner = new Scanner(System.in);

        String originStr = scanner.next();

        System.out.println(main.solution2(originStr));
    }

    public String solution(String str) {
        String result = "";

        for(char ch : str.toCharArray()) {
            if(result.indexOf(ch) == -1) result += ch;
        }

        return result;
    }

    public String solution2(String str) {
        String result = "";

        for(int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) result += str.charAt(i);
        }

        return result;
    }


}
