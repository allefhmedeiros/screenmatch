package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ErroConversaoAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner monitoraTeclado = new Scanner(System.in);
        System.out.println("Digite um título para busca: ");
        var novoTitulo = monitoraTeclado.nextLine();

        String endereco = "https://www.omdbapi.com/?t=" + novoTitulo.replace(" ", "+") + "&apikey=2c6d7e66";

        try{

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            //Titulo meuTitulo = gson.fromJson(response.body(), Titulo.class);
            TituloOmdb meuTituloOmdb = gson.fromJson(response.body(), TituloOmdb.class);

            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("---");
            System.out.println(meuTitulo);
        }catch (NumberFormatException e){
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        }
        catch (IllegalArgumentException e){
            System.out.println("Ocorreu um erro de argumento, verifique o endereço de URL criado.");
        }
        catch (ErroConversaoAnoException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("O programa finalizou corretamente.");
        }
    }
}
