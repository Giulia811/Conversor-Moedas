import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.io.Reader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

class ExchangeRate {
    public double conversorMoeda(String endereco) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(response.body(), JsonObject.class);
        return jsonObject.get("conversion_rate").getAsDouble();
    }
}