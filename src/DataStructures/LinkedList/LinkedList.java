package DataStructures.LinkedList;

class Node {

    int data;
    Node next;

    // Constructor
    Node(int d) {
        data = d;
        next = null;
    }
}

/*
 * This Linked List class is the common class to be used for all LinkedList related implementation for this package
 */

public class LinkedList {
    Node head; // head of list


    public LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data
        Node new_node = new Node(data);


        // If the Linked List is empty, then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public void printList(LinkedList list) {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }
}
