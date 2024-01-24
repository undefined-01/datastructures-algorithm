package queue;

import java.util.EmptyStackException;

public class CircularQueue {
    private int max; // 큐의 최대 용량
    private int front; // 큐의 첫번째 요소 커서
    private int rear; // 큐의 마지막 요소 커서
    private int num; // 큐의 현재 데이터 갯수
    private int[] queue; // 큐 본체

    public CircularQueue(int capacity) {
        front = rear = 0;
        max = capacity;

        try {
            queue = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    // front와 rear가 같이 있다면 큐가 비었다는 뜻
    public boolean isEmpty() {
        return front == rear;
    }

    // front의 바로 전에 rear가 있다면 큐가 가득 찼다는 뜻
    public boolean isFull() {
        return (rear+1) % max == front;
    }

    public void enqueue(int value) {
        if(isFull()) {
            System.out.println("queue is full");
            return;
        }

        // 순환
        rear = (++rear) % max;
        queue[rear] = value;
    }

    public int dequeue() {
        if(isEmpty()) return -1;

        int preIndex = front;
        // 순환
        front = (++front) % max;
        return queue[preIndex];
    }

    public void display() {
        System.out.println("FRONT :"+front+" REAR :"+rear);
        System.out.print("QUEUE DATA: ");
        for(int index = front + 1; index != (rear+1) % max; index = (index+1) % max)
            System.out.print(queue[index] + " ");
        System.out.println();
        System.out.println();
    }
}
