import java.util.LinkedList;

public class LL {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("thsis");
        list.addLast("lists");
        System.out.println(list);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
