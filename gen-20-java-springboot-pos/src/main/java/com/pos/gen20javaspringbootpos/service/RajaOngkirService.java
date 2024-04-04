package com.pos.gen20javaspringbootpos.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.pos.gen20javaspringbootpos.dto.RequestResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Map;


@Service
public class RajaOngkirService {


//    @Autowired
//    private RedisTemplate redisTemplate;
    private static final String KEY = "USER";

    public Object fetchAPI(){
        WebClient.Builder client =  WebClient.builder();
        Object content = client.build()
                .get()
                .uri("https://api.rajaongkir.com/starter/province")
                .header("key", "7e550d48008c81a23b7979f079b8b9a8")
                .retrieve()
                .bodyToMono(Object.class)
                .block();
        return content;
    }

    public Object fetchCost(){
        WebClient.Builder client =  WebClient.builder();
        String request = "origin=1&destination=114&weight=1700&courier=jne";
//        HttpHeaders headers = new HttpHeaders();headers.add("key", "7e550d48008c81a23b7979f079b8b9a8");
//        headers.setContentLength(3495);
//        headers.add("origin", "1");
//        headers.add("destination", "114");
//        headers.add("weight", "1700");
//        headers.add("courier", "jne");
        Object content = client.defaultHeader(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded")
                .build()
                .post()
                .uri("https://api.rajaongkir.com/starter/cost")
//                .headers(h -> h.addAll(headers))
                .header("key", "7e550d48008c81a23b7979f079b8b9a8")
                .body(BodyInserters.fromValue(request))
                .retrieve()
                .bodyToMono(Object.class)
                .block();
        System.out.println(content);
        return content;
    }


    public Object fetchCostDetail(){
        WebClient.Builder client =  WebClient.builder();
        String request = "origin=1&destination=114&weight=1700&courier=jne";
        Object content = client.defaultHeader(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded")
                .build()
                .post()
                .uri("https://api.rajaongkir.com/starter/cost")
                .header("key", "7e550d48008c81a23b7979f079b8b9a8")
                .body(BodyInserters.fromValue(request))
                .exchangeToMono(response -> {
                    if (response.statusCode().equals(HttpStatus.OK)) {
                        return response.bodyToMono(Object.class);
                    }
                    else {
                        return response.createError();
                    }
                    })
                .block();
        Gson gson = new Gson();
        String json = gson.toJson(content);
        Map<String, Object> data = gson.fromJson(json,
                new TypeToken<Map<String, Object>>(){}.getType()
        );
        Map<String, Object> rajaongkir = (Map<String, Object>) data.get("rajaongkir");
        List<Map<String, String>> results = (List<Map<String, String>>) rajaongkir.get("results");
        System.out.println(results);
        return results;
    }
    public Object fetchCostDetail1(){
        WebClient.Builder client =  WebClient.builder();
        String request = "origin=1&destination=114&weight=1700&courier=jne";
        Object content = client.defaultHeader(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded")
                .build()
                .post()
                .uri("https://api.rajaongkir.com/starter/cost")
                .header("key", "7e550d48008c81a23b7979f079b8b9a8")
                .body(BodyInserters.fromValue(request))
                .exchangeToMono(response -> {
                    if (response.statusCode().equals(HttpStatus.OK)) {
                        return response.bodyToMono(Object.class);
                    }
                    else {
                        return response.createError();
                    }
                    })
                .block();
        Gson gson = new Gson();
        String json = gson.toJson(content);
        Map<String, Object> data = gson.fromJson(json,
                new TypeToken<Map<String, Object>>(){}.getType()
        );
        Map<String, Object> rajaongkir = (Map<String, Object>) data.get("rajaongkir");
        List<Map<String, String>> results = (List<Map<String, String>>) rajaongkir.get("results");
        RequestResponse response = new RequestResponse();
        response.setOutput(response);
        response.setStatusCode(200);
        System.out.println(response);
        return response;
    }



}
