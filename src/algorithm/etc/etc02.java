package algorithm.etc;

import java.util.Scanner;

public class etc02 {
    public static void main(String[] args) {

        etc02 main = new etc02();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        String result = main.solution(str);

        System.out.println(result);

    }

    public String solution(String str) {
        StringBuilder result = new StringBuilder();


        for(char ch : str.toCharArray()) {
            if(Character.isLowerCase(ch)) result.append(Character.toUpperCase(ch));
            else result.append(Character.toLowerCase(ch));
        }

//        for(int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) >= 65  &&  str.charAt(i) <= 90) {
//                result.append((char)(str.charAt(i) + 32));
//            } else if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
//                result.append((char)(str.charAt(i) - 32));
//            }
//        }

        return result.toString();
    }
}
