package stack;

public class ArrayStack<E> {

    private E[] s;
    private int top;

    public ArrayStack() {
        s = (E[])new Object[1];
        top = -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public E peek() throws Exception {
        if(isEmpty()) throw new Exception();
        return s[top];
    }

    public void push(E data) {
        if(size() == s.length) resize(2 * s.length);
        s[++top] = data;
    }

    public E pop() throws Exception {
        if(isEmpty()) throw new Exception();
        E data = s[top];
        s[top--] = null;
        if(size() > 0 && size() == s.length / 4) {
            resize(s.length / 2);
        }

        return data;
    }

    public void resize(int length) {
        E[] temp = (E[]) new Object[length];
        if (top >= 0) System.arraycopy(s, 1, temp, 1, top);
    }
}
