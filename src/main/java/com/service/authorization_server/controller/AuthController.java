package com.service.authorization_server.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @PostMapping("/authorize")
    public Mono<?> authorize(){
        return Mono.just(ResponseEntity.ok(null));
    }

}
