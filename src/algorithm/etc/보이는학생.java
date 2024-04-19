package algorithm.etc;

import java.util.Scanner;

public class 보이는학생 {

    public static int solution(int[] arr, int n) {

        int maxHeight = arr[0];
        int count = 1;

        for(int i = 1; i < n; i++) {
            if(arr[i] > maxHeight) {
                count++;
                maxHeight = arr[i];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(solution(arr, n));
    }
}
