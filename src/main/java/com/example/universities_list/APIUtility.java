package com.example.universities_list;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;

public class APIUtility {

    public static void getUniversitiesList(String searchTerm) throws IOException, InterruptedException {
        searchTerm = searchTerm.replaceAll(" ","%20");

        String uri = "http://universities.hipolabs.com/search?country="+searchTerm;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();
        HttpResponse<Path> httpResponse = client.send(httpRequest, HttpResponse
                                                    .BodyHandlers
                                                    .ofFile(Paths.get("universities.json")));
    }

    public static Uni[] getUniversitiesListFromFile(){
        Gson gson = new Gson();
        Uni[] apiResponses = null;

        try(
                FileReader fileReader = new FileReader("universities.json");
                JsonReader jsonReader = new JsonReader(fileReader);
                )
        {
           apiResponses = gson.fromJson(jsonReader,Uni[].class);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return apiResponses;
    }
}