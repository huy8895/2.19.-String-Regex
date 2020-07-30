package CrawlSongExample;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            // Code here
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");

//            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
//            scanner.useDelimiter("\\Z");
//            //String content = scanner.next();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder contentBuilder = new StringBuilder();
            String con;
            while ((con = bufferedReader.readLine()) != null){
                contentBuilder.append(con);
            }

            String content = contentBuilder.toString();

// close scanner
            bufferedReader.close();
            //scanner.close();
            content = content.replaceAll("\\n+", "");
            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
