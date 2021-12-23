import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class Temperatyre {

    private static OkHttpClient okHttpClient = new OkHttpClient();
    private static ObjectMapper objectMapper = new ObjectMapper();
    final static private String API_KEY = "JlfItes9tazAWz0doiFWOZ8fvkKUAXn5";


        static public String sendTempRequest(String sityid) throws IOException {
            String tempFive;

            HttpUrl httpUrl = new HttpUrl.Builder()
                    .scheme("http")
                    .host("dataservice.accuweather.com")
                    .addPathSegment("forecasts")
                    .addPathSegment("v1")
                    .addPathSegment("daily")
                    .addPathSegment("5day")
                    .addPathSegment("292332")
                    .addQueryParameter("apikey", API_KEY)
                    .build();
            Request request = new Request.Builder()
                    .addHeader("accept", "application/json")
                    .url(httpUrl)
                    .build();
            Response response = okHttpClient.newCall(request).execute();

            String responseJson = response.body().string();


            JsonNode tempSity = objectMapper
                    .readTree(responseJson)
                    .at("/0/Temperatyre");
            tempFive = tempSity.asText();







            return tempFive;



        }
    }

