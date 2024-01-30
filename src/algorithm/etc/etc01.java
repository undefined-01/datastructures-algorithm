package algorithm.etc;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class etc01 {
    public static void main(String[] args) {

        etc01 main = new etc01();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        String findChar = scanner.next();

       int result = main.solution(str, findChar.charAt(0));

        System.out.println("result = " + result);
    }

    public int solution(String str, char ch) {
        int cnt = 0;
        str = str.toLowerCase();
        ch = Character.toLowerCase(ch);

        for(char target : str.toCharArray()) {
            if(target == ch) cnt++;
        }

//        for(int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == ch) cnt++;
//        }

        return cnt;
    }
}
