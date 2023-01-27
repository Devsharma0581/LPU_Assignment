package _26;

import java.util.ArrayList;

public class as2 {
    public static void main(String[] args) {
        ArrayList<String> ml = new ArrayList<String>();
        ml.add("A");
        ml.add("B");
        ml.add("C");
        ml.add("D");
        ml.add("E");

        int i1 = 0;
        int i2 = ml.size()-1;
        System.out.println("Before swaping, ArrayList contains : " + ml);

        String temp = ml.get(i1);
        ml.set(i1, ml.get(i2));
        ml.set(i1, temp);

        System.out.println("After swaping, ArrayList contains : " + ml);
    }
}