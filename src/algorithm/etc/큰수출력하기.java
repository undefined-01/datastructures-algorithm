package algorithm.etc;

import java.util.Arrays;
import java.util.Scanner;

public class 큰수출력하기 {

    public static String solution(int[] arr, int n) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] < arr[i + 1]) {
                sb.append(String.format("%d ", arr[i + 1]));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n + 1];
        arr[0] = -1;

        for(int i = 1; i < n + 1; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(solution(arr, n + 1));
    }
}
