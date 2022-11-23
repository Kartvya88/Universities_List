package com.example.universities_list;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class APIUtility {

    public static void getUniversitiesList(String searchTerm) throws IOException, InterruptedException {

        String uri = "http://universities.hipolabs.com/search";

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();

        HttpResponse<Path> httpResponse = httpClient.send(httpRequest, HttpResponse
                                                    .BodyHandlers
                                                    .ofFile(Paths.get("universities.json")));

    }
    /*
     *This method will read from "movies.json" and create an APIResponse object
     */
    public static APIResponse getUniversitiesListFromFile(){
        Gson gson = new Gson();

        APIResponse apiResponse =null;

        try(
                FileReader fileReader = new FileReader("universities.json");
                JsonReader jsonReader = new JsonReader(fileReader);
                )
        {
            apiResponse = gson.fromJson(jsonReader, APIResponse.class);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
return apiResponse;
    }


}