import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_loop {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(9);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(4);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        // Sort element
        Collections.sort(list);
        System.out.println(list);
    }
}