import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.remove(1);
        System.out.println(list.get(1));
        System.out.println(list.size());
    }
}
