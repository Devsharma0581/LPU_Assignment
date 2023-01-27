package _26;

import java.util.ArrayList;

public class as {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(4);
        myList.add(5);
        int a = 5;
        boolean isPresent = myList.contains(a);
        if (isPresent) {
            int firstIndex = myList.indexOf(a);
            int lastIndex = myList.lastIndexOf(a);
            System.out.println("Element " + a + " is present ");
            System.out.println("First occurrence of element " + a + " is at index " + firstIndex);
            System.out.println("Last occurrence of element " + a + " is at index " + lastIndex);
        } else {
            System.out.println("Element " + a + " is not present");
        }
    }
}