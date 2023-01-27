package _26;
import java.util.ArrayList;
public class as3 {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("One");
        l1.add("Two");
        l1.add("Three");
        l1.add("Four");
        l1.add("Five");
        System.out.println("Before copy : " + l1);

        ArrayList<String> list2 = new ArrayList<>(l1);
        list2.set(0, "1");
        list2.set(1, "2");
        list2.set(2, "3");
        System.out.println("After copy : " + list2);
    }
}
