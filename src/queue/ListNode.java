package queue;

import java.util.List;

public class ListNode {

    int data;
    ListNode next;

    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

}

class LinkedList {

    private ListNode head;
    int cnt;

    public LinkedList() {
        this.head = null;
        this.cnt = 0;
    }

    public ListNode add(int data) {
        ListNode node = null;

        if(this.head == null) {
            node = new ListNode(data);
            this.head = node;
        } else {
            node = new ListNode(data);
            ListNode currNode = this.head;

            while(currNode.next != null) {
                currNode = currNode.next;
            }

            currNode.next = node;
        }

        cnt++;
        return node;
    }

    public ListNode add(int data, int position) {
        ListNode currNode = this.head;
        ListNode node = new ListNode(data);

        if(position == 0) {
            node.next = currNode;
            this.head = node;
        } else {

            ListNode prevNode = null;

            for(int i = 0; i < position; i++) {
                prevNode = currNode;
                currNode = currNode.next;
            }

            node.next = currNode;
            prevNode.next = node;
        }

        cnt++;
        return node;
    }

    public ListNode remove(int position) {
        ListNode currNode = this.head;

        if(position > cnt || position <= 0) {
            return null;
        }

        if(position == 1) {
            head = currNode.next;
        } else {

            ListNode prevNode = null;

            for(int i = 0; i < position; i++) {
                prevNode = currNode;
                currNode = currNode.next;
            }

            prevNode.next = currNode.next;
        }

        cnt++;
        return currNode;
    }
}
