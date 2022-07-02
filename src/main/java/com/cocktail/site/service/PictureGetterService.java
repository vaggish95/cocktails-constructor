package com.cocktail.site.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Random;

@Service
public class PictureGetterService {

    @Autowired
    private RestTemplate restTemplate;

    static String PICTURE_URL = "https://api.giphy.com/v1/gifs/search?api_key=u0xFrUHQ4wgvmMiAxAaWgffchUgm1bzJ&q=bar&limit=300&offset=0&rating=g&lang=en;";

    public String getUsersPictureByApi (){
        String json = restTemplate.getForObject(PICTURE_URL, String.class);
       return jsonMapper(json);
    }

    private String jsonMapper (String json) {
        String linkToPhoto = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode root = mapper.readTree(json).get("data");
            Random randomPhoto = new Random();
            linkToPhoto = root.get(Math.abs(randomPhoto.nextInt(root.size())))
                    .get("images")
                    .get("original")
                    .get("url").asText();

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return linkToPhoto;
    }


}
