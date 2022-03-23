package day28_arrayPractice;

public class WebsiteChecker {
    public static void main(String[] args) {

        String [] urls= {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com",
                "nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com",
                "comcast.net", "tamu.edu", "utexas.edu"};
        int counterCom = 0;
        int counterOrg = 0;
        int counterJp = 0;
        int counterEdu = 0;
        int counterGov = 0;

        for (int i = 0; i <urls.length ; i++) {

            if (urls[i].contains(".com")) {
                counterCom++;
            }
            if (urls[i].contains(".org")) {
                counterOrg++;
            }
            if (urls[i].contains(".jp"))  {
                counterJp++;
            }
            if (urls[i].contains(".edu")) {
                counterEdu++;
            } if (urls[i].contains(".gov")) {
                counterGov++;
            }
        }
        System.out.println(".coms are : " +(counterCom));
        System.out.println(".org are : " + counterOrg);
        System.out.println(".jps are : " + counterJp);
        System.out.println(".eduss are : " + counterEdu);
        System.out.println(".gov are : " + counterGov);
    }
}
