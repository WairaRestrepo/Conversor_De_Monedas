package com.alura.conversor;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class PrincipalConConversion {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner lectura = new Scanner(System.in);
        List<Moneda> monedas = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();


        while(true){
            System.out.println("***************************************************");
            System.out.println("Sea Bienvenido/a al conversor de moneda =]"
                    +"\n"+"1) Dólar =>> Peso argentino"+"\n"+"2) Peso argentino =>> Dólar"+"\n"+
                    "3) Dólar =>> Real brasileño"+"\n"+"4" +
                    "4)Real brasileño=>>Dólar"+"\n"+"5)dolar =>> Peso Colombiano"+"\n"+"6)Peso Colombiano =>> Dólar"+"\n"+"7) Salir");
            System.out.println("Elija una opción válida: ");
            System.out.println("***************************************************");

             var opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    ;
                    break;
                case 2:
                    ;
                    break;
                case 3:
                    ;
                    break;
                case 4:
                    ;
                    break;
                case 5:
                   ;
                    break;
                case 6:
                   ;
                    break;

                default:
                    System.out.println("Opción inválida");
            }

            var busqueda = lectura.nextLine();

            if(busqueda.equalsIgnoreCase("salir")){
                break;
            }
            System.out.println(busqueda);
            String direccion = "https://v6.exchangerate-api.com/v6/71601bfd7ab90947e2a43b07/latest/"+"USD";

            try{

                // Making client- se le solicita el cliente
                HttpClient client = HttpClient.newHttpClient();

                // Making Request-lo que se obtiene
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build(); //Se utiliza el patron build.
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);/*"Este es el cuerpo de la peticion"*/

            }catch (NumberFormatException e){
                System.out.println("Ocurrió un error: ");
                System.out.println(e.getMessage());
            }catch(IllegalArgumentException e){
                System.out.println("Error en la URI, verifique la dirección.");
            }        }

    }
}
