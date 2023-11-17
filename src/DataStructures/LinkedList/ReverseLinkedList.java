package DataStructures.LinkedList;

public class ReverseLinkedList {
    private static Node reverse(Node head) {
        Node prev = null;
        Node node = head;
        Node nextNode = null;

        while (node != null) {
            nextNode = node.next;
            node.next = prev;
            prev = node;
            node = nextNode;
        }
        head = prev;
        return head;
    }

    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        // Insert the values
        list = list.insert(list, 1);
        list = list.insert(list, 2);
        list = list.insert(list, 3);
        list = list.insert(list, 4);
        list = list.insert(list, 5);
        list = list.insert(list, 6);
        list = list.insert(list, 7);
        list = list.insert(list, 8);

        list.printList(list);

        list.head = reverse(list.head);

        list.printList(list);
    }
}
