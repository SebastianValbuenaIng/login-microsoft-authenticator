package com.example.demo;

import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/graph")
    @ResponseBody
    public String graph(
            @RegisteredOAuth2AuthorizedClient("graph") OAuth2AuthorizedClient graphClient
    ) {
        return String.valueOf(graphClient);
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello Paulina";
    }
}