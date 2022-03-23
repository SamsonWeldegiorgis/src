package day20_string_examples3;

public class SearchResult {
    public static void main(String[] args) {
        /*
        Task 2 : Assume that you searched a word in Google  Search Engine.After that you took a result message like this


       "About 3,640,000,000 results (0.78 seconds)"

        According to this result print out search Time and number of Result

        Input :  "About 640,000,000 results (0.78 seconds)"

        Output:
                    Result number is 640,000,000
                    Response time is 0.78 seconds
                 */
        String result = "About 4,500,000,000 results (0.70 seconds) ";

        int startIndex = result.indexOf(" ");  // t-4
        int endIndex = result.indexOf(" ",startIndex+1);  // 0-r

        String searchResult = result.substring(startIndex+1, endIndex);
        System.out.println("SearchResult : " + searchResult);
        System.out.println(result.substring(startIndex+1,endIndex));

        startIndex = result.indexOf("(");
        endIndex   = result.indexOf(")");

        String searchTime =result.substring(startIndex+1, endIndex);
        System.out.println("SearchTime: " + searchResult);


    }
}
