package day51_inheritance.access.b;

import day51_inheritance.access.a.First;

public class Three {

 // different class, different package

        public static void main(String[] args) {
            First obj = new First();
            System.out.println(obj.one);
//            System.out.println(obj.two);
//            System.out.println(obj.three);
//            System.out.println(obj.four);
        }

    // they are in different packages,,,unaccessible outside a package( protected,default and private)
}
