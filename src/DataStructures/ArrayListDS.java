package DataStructures;

import java.util.ArrayList;

public class ArrayListDS {
    public static void main(String[] args) {
        ArrayList<Integer> arl = new ArrayList<Integer>();

        arl.add(23);
        arl.add(43);
        arl.add(2,71);

        arl.remove(1);
        System.out.println(arl);  // [23,71]
    }
}
