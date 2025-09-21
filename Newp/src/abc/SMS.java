package abc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class SMS {
    public static void main(String[] args) {
        try {
        	String apiKey = "apikey=" + "abcdef1234567890abcdef1234567890"; // replace with your real API key
        	String numbers = "&numbers=" + "91XXXXXXXXXX"; // recipient number with country code
        	String message = "&message=" + URLEncoder.encode("Hello Vaibhav!", "UTF-8");
        	String sender = "&sender=" + "TXTLCL"; // 6-character sender ID


            String data = apiKey + numbers + message + sender;
            URL url = new URL("https://api.textlocal.in/send/?");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Length", Integer.toString(data.length()));

            OutputStream os = conn.getOutputStream();
            os.write(data.getBytes("UTF-8"));
            os.close();

            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            StringBuffer response = new StringBuffer();
            while ((line = rd.readLine()) != null) {
                response.append(line);
            }
            rd.close();

            System.out.println("Response: " + response.toString());

        } catch (Exception e) {
            System.out.println("Error SMS: " + e);
        }
    }
}
