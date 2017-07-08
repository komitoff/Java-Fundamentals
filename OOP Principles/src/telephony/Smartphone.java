package telephony;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smartphone implements Callable, Browsable{

    private String number;
    private String url;

    @Override
    public String call(String number) {
        String pattern = "[a-zA-Z]";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(number);
        if (m.find()) {
            return "Invalid number!";
        }
        return "Calling... " + number;
    }

    @Override
    public String browse(String url) {
        String pattern = "\\d+";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(url);
        if (m.find()) {
            return "Invalid URL!";
        }
        return "Browsing: " + url + "!";
    }

    public Smartphone() { }
}
