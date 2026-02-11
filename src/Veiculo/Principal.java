package Veiculo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Toyota", "Corolla", 2021, 90.000);
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(v1);

        System.out.println(json);
    }
}
