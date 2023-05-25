package pagesjson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

public class GetFromFakeApi {

    public static void main(String[] args) throws IOException, JSONException {
        String url = "https://jsonplaceholder.typicode.com/albums";
        readMoreJsonFromUrl(url);
    }

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        String text = sb.toString();
        return text;
    }

    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is,
                    Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }


    public static void readMoreJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is,
                    Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONArray array1 = new JSONArray(jsonText);
            System.out.println(array1.length());
            System.out.println(array1);
            System.out.println(array1.get(0));
            JSONObject jsnobject = new JSONObject(array1.get(0).toString());
            System.out.println(jsnobject.get("title").toString());
            System.out.println(jsnobject.get("userId").toString());

        } finally {
            is.close();
        }
    }


}