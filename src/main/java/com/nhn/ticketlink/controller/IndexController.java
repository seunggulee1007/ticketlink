package com.nhn.ticketlink.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Controller
public class IndexController {

    RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/")
    public String index(@RequestParam(name="queue", defaultValue = "default") String queue,
                        @RequestParam(name="user_id") Long userId) {
        URI uri = UriComponentsBuilder.fromUriString("http://localhost:9010")
            .path("/api/v1/queue/allowed")
            .queryParam("queue", queue)
            .queryParam("user_id", userId)
            .encode()
            .build()
            .toUri();
        ResponseEntity<AllowedUserResponse> response = restTemplate.getForEntity(uri, AllowedUserResponse.class);
        if(response.getBody() == null || !response.getBody().allowed()) {
            return "redirect:http://127.0.0.1:9010/waiting-room?queue=%s&user_id=%d&redirect_url=%s".formatted(queue, userId, "http://127.0.0.1:9000?user_id=%d".formatted(userId));
        }

        return "index";
    }

}
