package recursive;

import java.util.Scanner;

public class Hanoi {

    static void move(int no, int x, int y) {
        if(no > 1) {
            move(no - 1, x, 6 - x - y);
        }

        System.out.println("원판[" + no + "]을" + x + "기둥에서 " + y + "기둥으로 이돟");

        if(no > 1) {
            move(no - 1, 6 - x - y, y);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        move(x, 1, 3);
    }
}
