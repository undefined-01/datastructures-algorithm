package algorithm.etc;

import java.util.Scanner;

public class 피보나치수열 {

    public static int[] solution(int n) {
        int[] pibo = new int[n];
        pibo[0] = pibo[1] = 1;

        for(int i = 2; i < n; i++) {
            pibo[i] = pibo[i - 1] + pibo[i - 2];
        }

        return pibo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int x : solution(scanner.nextInt())) {
            System.out.print(x + " ");
        }
    }
}
