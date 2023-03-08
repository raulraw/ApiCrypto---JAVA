import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class bitcoin {

	public static void main(String[] args) {
        try {
            //Public API:
            //https://api.binance.com/api/v3/ticker/price"

            URL url = new URL("https://api.binance.com/api/v3/ticker/price?symbol=");
            
            //currencies = {"BTCUSDT","ETHUSDT","EGLDUSDT","VETUSDT";
            
            String[] strArray = new String[4];
            strArray[0] = "BTCUSDT";
            strArray[1] = "ETHUSDT";
            strArray[2] = "EGLDUSDT";
            strArray[3] = "VETUSDT";
            //URL[] strArray2;
            for (int i = 0; i < 4; i++) {
               // { //String urll = url + strArray[i];
               //  strArray2[i] = URL(url+strArray[i]);
             //   j++;
             //   }
            
            //URL URL1 = new URL(url+strArray[0]);
           // System.out.println(URL1.toString());
            url = new URL(url+strArray[i]);  
            
            
            
            
            
               // System.out.println(URL1);// things done
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            //Check if connect is made
            int responseCode = conn.getResponseCode();

            // 200 OK
            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } else {
                
               StringBuilder informationString = new StringBuilder();
               Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                  informationString.append(scanner.nextLine());
                }
                //Close the scanner
                scanner.close();

                System.out.println(informationString);}
             url = new URL("https://api.binance.com/api/v3/ticker/price?symbol=");
                

        } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}    