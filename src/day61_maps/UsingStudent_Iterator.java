package day61_maps;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingStudent_Iterator {
    public static void main(String[] args) {

        ArrayList < String > names = new ArrayList<>();
        names.add("james");
        names.add("emre");
        names.add("bruce");
        System.out.println(names);

        Iterator<String> it = names.iterator();
        System.out.println(it.next()); // move the pin, and return the element
        System.out.println(it.next());
        System.out.println(it.next());
//        System.out.println(it.next()); // no 4th element, so exception happened
        System.out.println(names);

    }
}
