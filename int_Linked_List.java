// Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.

package DSA;

public class int_Linked_List {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    void addfirst1(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void printlist_ques() {
        if (head == null) {
            System.out.println("list is emppty: ");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        int_Linked_List list = new int_Linked_List();
        list.addfirst1(3);
        list.addfirst1(2);
        list.addfirst1(8);
        list.addfirst1(3);
        list.addfirst1(7);
        list.addfirst1(5);
        list.addfirst1(1);
        list.printlist_ques();
    }
}
