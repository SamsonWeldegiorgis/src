package day44_Constructor2;

public class UseSong {
    public static void main(String[] args) {
        Song song1 = new Song("Haleluja");
        System.out.println(song1);

        Song song2 = new Song ("Viva la vida", 3.5);
        System.out.println(song2);

        Song song3 = new Song("Thriller", 4.0, "Michael Jackson", "Pop");
        System.out.println(song3);
    }
}
