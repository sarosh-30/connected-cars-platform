package com.connected.spark.controller;

import com.connected.spark.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/api/carspark")
public class CarSparkController {

    private final WebClient.Builder webClientBuilder;

    @Autowired
    public CarSparkController(WebClient.Builder webClientBuilder) {
        this.webClientBuilder = webClientBuilder;
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long id) {
        UserDTO userDTO = webClientBuilder.build()
                .get()
                .uri("http://localhost:8080/api/users/" + id)
                .retrieve()
                .bodyToMono(UserDTO.class)
                .block();

        return ResponseEntity.ok(userDTO);
    }
}
