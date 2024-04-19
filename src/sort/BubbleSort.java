package sort;

import java.util.Scanner;

public class BubbleSort {

    public static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    public static void bubbleSort(int[] a, int n) {
        for(int i = 0; i < n - 1; i++) {
            int swapCnt = 0;
            for(int j = n - 1; j > i; j--) {
                if(a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    swapCnt++;
                }
            }
            if(swapCnt == 0) break;
        }
    }

    public static void bubbleSort2(int[] a, int n) {
        int k = 0;
        while(k < n - 1) {
            int last = n - 1;
            for(int j = n - 1; j > k; j--) {
                if(a[j - 1] < a[j]) {
                    swap(a, j - 1, j);
                    last = j;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("버블정렬(1)");
        System.out.println("요솟수 : ");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for(int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        bubbleSort(x, nx);

        System.out.println("오름차순 정렬");
        for(int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
