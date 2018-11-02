package hacker.datastructures.linkedlists;

import java.io.BufferedWriter;
import java.io.IOException;

public class InsertNodeTail {
	
	
	public static void run() {
		SinglyLinkedList llist = new SinglyLinkedList();

        int[] llistItems = {141,302,164,530,474};

        for (int i = 0; i < llistItems.length; i++) {
            int llistItem = llistItems[i];
          SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistItem);

          llist.head = llist_head;
        }
        
        while(llist.head != null) {
        	System.out.println(llist.head.data);
        	llist.head = llist.head.next;
        }
	}
	

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;

        public SinglyLinkedList() {
            this.head = null;
        }

      
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        
        SinglyLinkedListNode n = new SinglyLinkedListNode(data);
        SinglyLinkedListNode headB = head;

        // If we are inserting in a null LL
        if(head == null) return n;
        
        // Reach tail
        while(head.next != null) head = head.next;
        
        head.next = n;
        return headB;
       
    }
    
}
