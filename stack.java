import java.util.*;

public class stack {

    int top;
    int max;
    int[] a;

    stack(int size) {
        max = size;
        top = -1;
        a = new int[max];
    }

    void push(int ele) {
        if (top == max - 1) {
            System.out.println("stack is overflow");
            return;
        }
        top++;
        a[top] = ele;
    }

    void pop() {
        if (top == -1) {
            System.out.println("stack is underflow");
            return;
        }
        System.out.println("deleted element is " + a[top]);
        top--;
    }

    void printlist() {
        if (top == -1) {
            System.out.println("Stack is underflow");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(a[i] + " ");
        }
    }

    void peek() {
        System.out.println("peek element of stack is " + a[top]);
    }

    boolean isFull() {
        if (top == max - 1)
            return true;
        else
            return false;
    }

    boolean isempty() {
        if (top == -1)
            return true;
        else
            return false;
    }

    public int search(int e) {
        for (int i = 0; i < max; i++) {
            if (a[i] == e) {
                System.out.print("element ");
            }
        }
        return e;
    }

    public static void main(String[] args) {
        stack s = new stack(10);

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(12);
        s.push(31);
        System.out.println(s.isFull());
        s.printlist();
        System.out.println();
        s.pop();
        s.printlist();
        s.peek();
    }
}
