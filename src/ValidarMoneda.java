import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ValidarMoneda {

    public Moneda consultarMoneda(String monedabase, String monedatarget){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/31ff8504b7b46c2dba367d73/pair/" + monedabase + "/" + monedatarget);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        }
        catch (Exception e) {
            throw new RuntimeException("No se encontro el tipo de moneda");
        }

    }
}
