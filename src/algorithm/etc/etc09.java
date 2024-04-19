package algorithm.etc;

import java.util.Arrays;
import java.util.Scanner;

public class etc09 {

    public static int[] solution(String str, char ch) {
        int count = 1000;
        int[] arr = new int[str.length()];

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) {
                count = 0;
                arr[i] = count;
            } else {
                count++;
                arr[i] = count;
            }
        }

        count = 1000;
        for(int i = str.length() -1; i >= 0; i--) {
            if(str.charAt(i) == ch) {
                count = 0;
            } else {
                count++;
                arr[i] = Math.min(count, arr[i]);
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] arr = str.split(" ");
        Arrays.stream(solution(arr[0], arr[1].charAt(0)))
                .forEach(e -> System.out.printf("%d ", e));
    }
}
