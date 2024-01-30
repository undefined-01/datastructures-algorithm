package algorithm.etc;

import java.util.Scanner;

public class etc03 {
    public static void main(String[] args) {

        etc03 main = new etc03();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String result = main.solution(str);

        System.out.println(result);

    }

    public String solution(String str) {
        String[] strArr = str.split(" ");
        String result = "";

        for(String word : strArr) {
            if(word.length() > result.length()) {
                result = word;
            }
        }

        return result;
    }

    public String solution2(String str) {
        String result = "";
        int position = 0;
        int MAX = Integer.MIN_VALUE;

        while((position = str.indexOf(" ")) != -1) {
            String temp = str.substring(0, position);

            if(temp.length() > MAX) result = temp;

            str = str.substring(position + 1);
        }

        if(str.length() > MAX) result = str;

        return result;
    }
}
