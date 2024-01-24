package queue;

public class IntAryQueue {
   int MAX = 1000;
   int front;
   int rear;
   int[] queue;

   public IntAryQueue() {
       front = rear = 0;
       queue = new int[MAX];
   }

   public boolean isEmpty() {
       return (front == rear);
   }

   public boolean isFull() {
       if(rear == MAX - 1) {
           return true;
       }

       return false;
   }

   public int size() {
       return rear - front;
   }

   public void push(int value) {
       if(isFull()) {
           System.out.println("queue is full");
           return;
       }

       queue[rear++] = value;
   }

   public int pop() {
       if(isEmpty()) {
           System.out.println("queue is empty");
           return -1;
       }

       return queue[front++];
   }

   public int peek() {
       if(isEmpty()) {
           System.out.println("queue is empty");
           return -1;
       }

       return queue[front];
   }
}
