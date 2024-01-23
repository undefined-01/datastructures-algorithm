package stack;

public class IntStack {
    private int max; //  최대 용량
    private int pointer; // 포인터
    private int[] stk; // 스택 배열

    // 스택이 비었을 경우
    public class EmptyInStackException extends RuntimeException {
        public EmptyInStackException() {}
    }

    // 스택이 가득 찼을 경우
    public class OverFlowIntStackException extends RuntimeException {
        public OverFlowIntStackException() {}
    }

    public IntStack(int capacity) {
        pointer = 0;
        max = capacity;

        try {
            stk = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }

    }

    public void push(int x) throws OverFlowIntStackException {
        // 가득 찼을 시 예외
        if(pointer >= max) throw new OverFlowIntStackException();
        // 데이터 삽입 후 포인터 증가
        stk[pointer++] = x;
    }

    public int pop() throws EmptyInStackException {
        // 비어있을 시 예외
        if(pointer <= 0) throw new EmptyInStackException();
        // 포인터 감소 후 데이터 반환
        return stk[--pointer];
    }

    public int peek() throws EmptyInStackException {
        if(pointer <= 0) throw new EmptyInStackException();
        // 가장 위의 데이터를 반환
        return stk[pointer - 1];
    }

    public int indexOf(int x) {
        for(int i = pointer - 1; i >= 0; i--) {
            if(stk[pointer] == x) return i;
        }

        return -1;
    }

    public void clear() {
        pointer = 0;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return pointer;
    }

    public boolean isEmpty() {
        return pointer <= 0;
    }

    public boolean isFull() {
        return pointer >= max;
    }

    public void print() {
        if(isEmpty()) System.out.println("stack is empty");

        for(int i = pointer - 1; i >= 0; i--) {
            System.out.println(stk[i] + " ");
        }
        System.out.println();
    }
}
