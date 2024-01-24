package queue;

public class ListNodeQueue {

    private ListNode head;

    public ListNodeQueue() {
        this.head = null;
    }

    public void enqueue(int data) {

        ListNode currNode = this.head;
        ListNode node = new ListNode(data);

        if(this.head == null) {
            this.head = node;
            return;
        }

        while(node.next != null) {
            currNode = currNode.next;
        }

        currNode.next = node;
    }

    public ListNode dequeue() {

        ListNode currNode = this.head;

        if(this.head == null) return null;

        this.head = currNode.next;
        currNode.next = null;

        return currNode;
    }
}
