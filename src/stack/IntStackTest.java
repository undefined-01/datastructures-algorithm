package stack;

import java.util.Scanner;

public class IntStackTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntStack intStack = new IntStack(64);

        while(true) {
            System.out.println("현재 데이터 수 : " +  intStack.size() + " / " + intStack.capacity());
            System.out.println("1. push    2. pop    3. peek    4. print    5. exit");

            int menu = scanner.nextInt();
            if(menu == 0) break;

            int x;

            switch (menu) {
                case 1:
                    System.out.println("데이터 : ");
                    x = scanner.nextInt();

                    try {
                        intStack.push(x);
                    } catch (IntStack.OverFlowIntStackException e) {
                        System.out.println("stack is full!!");
                    }

                    break;
                case 2:
                    try {
                        x = intStack.pop();;
                        System.out.println("pop : " + x);
                    } catch (IntStack.EmptyInStackException e) {
                        System.out.println("stack is empty");
                    }

                    break;
                case 3:
                    try {
                        x = intStack.peek();
                        System.out.println("peek : " + x);
                    } catch (IntStack.EmptyInStackException e) {
                        System.out.println("stack is empty");
                    }

                    break;
                case 4:
                    intStack.print();
                    break;
            }
        }

    }
}
