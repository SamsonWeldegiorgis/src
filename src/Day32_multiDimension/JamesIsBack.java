package Day32_multiDimension;

public class JamesIsBack {
    public static void main(String[] args) {

        String[][] words = {{"James", "is", "back"}, {"he", "was", "never", "gone"}, {"methods", "tomorrow"}};

        for (String[] each : words) {
            for (String word : each) {
                System.out.print(word.charAt(word.length() - 1));
            }
            System.out.println("");

    }
        System.out.println();
}
    }

