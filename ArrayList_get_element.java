import java.util.ArrayList;

public class ArrayList_get_element {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        int element = list1.get(2);
        System.out.println(element);
    }
}