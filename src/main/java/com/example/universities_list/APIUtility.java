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

public class APIUtility {

    public static APIResponse[] getUniversitiesList(String searchTerm) throws IOException, InterruptedException {
        searchTerm = searchTerm.replaceAll(" ","%20");

        String uri = "http://universities.hipolabs.com/search?country="+searchTerm;

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();


        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse
                .BodyHandlers.ofString());

        //parse the JSON object and return it as a Java object
        Gson gson = new Gson();
        return gson.fromJson(response.body(),APIResponse[].class);

    }
    /*
     *This method will read from "movies.json" and create an APIResponse object
     */

    public static APIResponse[] getUniversitiesListFromFile(){
        Gson gson = new Gson();
        APIResponse[] apiResponse = new APIResponse[100];

        try(
                FileReader fileReader = new FileReader("universities.json");
                JsonReader jsonReader = new JsonReader(fileReader);

                )
        {
            apiResponse = gson.fromJson(jsonReader,APIResponse[].class);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return apiResponse;
    }
}