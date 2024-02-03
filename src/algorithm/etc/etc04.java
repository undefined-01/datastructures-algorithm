package algorithm.etc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class etc04 {
    public static void main(String[] args) {

        etc04 main = new etc04();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] strArr = new String[n];

        for(int i = 0; i < n; i++) {
            strArr[i] = scanner.next();
        }

        String[] result = main.solution2(strArr);

        for(String str : result) {
            System.out.println(str);
        }

    }

    public List<String> solution(String[] strArr) {
        StringBuilder builder = new StringBuilder();
//        String[] temp = new String[strArr.length];
        ArrayList<String> list = new ArrayList<>();

//        for(int i = 0; i < strArr.length; i++) {
//            temp[i] = builder.append(strArr[i]).reverse().toString();
//            builder.delete(0, temp[i].length());
//        }

        for(String str : strArr) {
            String temp = new StringBuilder(str).reverse().toString();
            list.add(temp);
        }

        return list;
    }

    public String[] solution2(String[] strArr) {

        for(int i = 0; i < strArr.length; i++) {

            char temp = ' ';
            char[] target = strArr[i].toCharArray();

            for(int j = 0; j < target.length / 2; j++) {
                temp = target[j];
                target[j] = target[target.length - 1 - j];
                target[target.length - 1 - j] = temp;
            }

            strArr[i] = new String(target);

        }

        return strArr;
    }

    public ArrayList<String> solution3(String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();

        for(String str : strArr) {
            char[] s = str.toCharArray();
            int lt = 0;
            int rt = s.length - 1;

            while(lt < rt) {
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt++;
            }
        }

        return answer;
    }

}
