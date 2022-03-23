package day20_string_examples3;

public class SmsParts {
    public static void main(String[] args) {
        /*
                [SMS parts]
        Given a String in the following format:
            “Sender: <James Bond>. From Number: [202-123-3456]. +
            Message: {“I love programming and problem solving}”

        Separate these parts and print them separately: Sender: actualSender
        Number: actualNumber Message: actualMessage”
         */

        String message = "Sender: <James Bond>. From Number: [202-123-3456]. + \n" +
                "  Message: {“I love programming and problem solving.}";
        System.out.println(message);

        int senderStart = message.indexOf('<');  // James
        int senderEnd   = message.indexOf('>');   // Bond

        int numberStart = message.indexOf('[');  // 202
        int numberEnd = message.indexOf(']');   // 3456

        int messageStart = message.indexOf('{');  // I
        int messageEnd = message.indexOf('}');  // g.

        System.out.println("\nSender: " + message.substring(senderStart+1,senderEnd));
        System.out.println("Number: "+ message.substring(numberStart+1,numberEnd));
        System.out.println("Message: "+ message.substring(messageStart+2, messageEnd));

        String result = message.substring(senderStart+1,senderEnd);

        if (senderStart>=0 && senderEnd >=0){
            System.out.println("result:" + result);
        }


    }


}
