package day20_string_examples3;

public class IndexExample {
    public static void main(String[] args) {

        String url = "https://www.etsy.com/c/toys-and-entertainment?ref=catnav-11049";
        String url2 = "https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys? refer-11049";

        int startIndex = url.indexOf("c/");
        int endIndex = url.indexOf("?");

        String categoryName = url.substring(startIndex+2, endIndex);
        System.out.println(categoryName);

        categoryName = categoryName.replace('-', ' ');
        System.out.println(categoryName);


//        if (url2.contains("/")){
//            categoryName=categoryName.substring(0,categoryName.indexOf("/"));
        }
    }

