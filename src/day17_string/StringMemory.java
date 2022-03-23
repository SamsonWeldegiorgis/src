package day17_string;

public class StringMemory {
    public static void main(String[] args) {

        String first = "java"; // String literal, in string pool


        String second = new String ("java"); // String object, not in String pool,
                                                    // but directly in the heap.

        System.out.println("F=2nd  "+ (first == second)); // with String types gives you false. The == doesn't compare
                                        // the characters, it compares the memory location of the object

        String third = "java"; //
        System.out.println("F=3rd  "+ (first == third)); // true b/s they have same object . They are in same String pool
                                            // point to the same object , 2 objects : java & java

        String fourth = "Java";
        System.out.println("F=4th  "+(first == fourth)); // false of diffrence in lower case / Upper case
                                              // 3 total objects = 2 in String pool and 1 in heap

        String fifth = new String ("java"); //
        // but directly in the heap.

        System.out.println("F=5th  "+ (first == fifth)); // false b/s of d/t memory locations
        System.out.println("2nd=5th  "+ (second == fifth)); // false b/s of d/t memory locations


    }
}
