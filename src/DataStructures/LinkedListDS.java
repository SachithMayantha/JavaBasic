package DataStructures;

import java.util.LinkedList;

public class LinkedListDS {
    public static void main(String[] args) {
        //LinkedList type is String or any
        LinkedList<String> link = new LinkedList<String>();

        link.add("Kamal");
        link.add("Nimal");
        link.add("Sumal");

        System.out.println(link.getFirst());
        System.out.println(link.size());
    }

}

