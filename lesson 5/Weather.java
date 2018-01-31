package lesson5;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        String url = "http://www.go.th/xml/weasher_report.php?StationNumber=48455";
        Scanner web = new Scanner(new URLStream(url));
        String begTag = "<![CDATA]";
        String endTag = "]]>";
        String out = "";
        while (web.hasNext()) {
            String line = web.nextLine();
            // ... <! [CDATA[ ??????]]>...
            int beg = line.indexOf(begTag);
            if (beg >= 0) {
                int end = line.indexOf(endTag);
                if (end >= 0) {
                    out += line.substring(beg + begTag.length(),end);
                }
            }
        }
        System.out.println(out);
    }
}
