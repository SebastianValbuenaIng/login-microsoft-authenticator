package com.example.demo;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        OidcUser userDetails = (OidcUser)  SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String preferredUsername = userDetails.getPreferredUsername();
        return String.format("Hello %s world", preferredUsername);
    }
}