package DSA;

public class reverse_linkedlist_recursive_iterative {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addlast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printlist() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public void reverseIterative() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        reverse_linkedlist_recursive_iterative list = new reverse_linkedlist_recursive_iterative();
        list.addfirst(5);
        list.addfirst(6);
        list.addfirst(7);
        list.addfirst(8);
        list.printlist();

        list.addlast(9);
        list.printlist();
        list.reverseIterative();
        list.printlist();

        // list.head = list.reverseRecursive(list.head);
        // list.printlist();
    }
}