package pagesjson;

import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

public class GetFromWordnik {

    public static void main(String[] args) throws IOException, JSONException {
        String url = "https://api.wordnik.com/v4/words.json/"
                + "randomWords?hasDictionaryDef=true&minCorpusCount=0&minLength=5&maxLength"
                + "=15&limit=1&api_key=a2a73e7b926c924fad7001ca3111acd55af2ffabf50eb4ae5";
        JSONObject json = getJsonFromUrl(url);
        System.out.println(json.toString());
        System.out.println(json.get("word"));
    }

    private static String readTextFromJson(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int i;
        while ((i = rd.read()) != -1) {
            sb.append((char) i);
        }
        String text = sb.toString().replace("[", "");
        return text;
    }

    public static JSONObject getJsonFromUrl(String url) throws IOException, JSONException {
        InputStream in = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(in,
                    Charset.forName("UTF-8")));
            String jsonText = readTextFromJson(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            in.close();
        }
    }
}
