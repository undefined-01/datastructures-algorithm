package algorithm.etc;

import java.util.Scanner;

public class 가위바위보 {

    public static String solution(int n, int[] arr_a, int[] arr_b) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            int calc = arr_a[i] - arr_b[i];

            if (calc == -2 || calc == 1) sb.append("A ");
            else if (calc == 0) sb.append("D ");
            else sb.append("B ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr_a = new int[n];
        int[] arr_b = new int[n];

        for(int i = 0; i < n; i++) {
            arr_a[i] = scanner.nextInt();
        }

        for(int i = 0; i < n; i++) {
            arr_b[i] = scanner.nextInt();
        }

        System.out.println(solution(n, arr_a, arr_b));
    }
}
