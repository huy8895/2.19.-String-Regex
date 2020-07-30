package CrawNews;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNews {
    static String REGEX = "title=\"(.*?)\">";
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));

            StringBuilder contentBuilder = new StringBuilder();
            String content;
            while ((content = bufferedReader.readLine()) != null){
                contentBuilder.append(content);
            }
            content = contentBuilder.toString();
            bufferedReader.close();

            content = content.replaceAll("\\n+", "");
            Pattern pattern = Pattern.compile(REGEX);
            Matcher matcher = pattern.matcher(content);

            while (matcher.find()){
                System.out.println(matcher.group(1));
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
