package day30_arraysForEach;

public class AWS {
    public static void main(String[] args) {
        /*

         */

    // app and we want to deploy on multipl zoness

    String app = "etsy";
    String zones = "us-east,us-west1,us-west2,us=west3";

    String [] allZones = zones.split(",");

    for (String eachZone : allZones){
        System.out.println(app+ " is delopynig on " + eachZone);
    }
}}
