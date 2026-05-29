package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    // Endpoint simple para que Sliplane compruebe que la app está viva.
    // No toca base de datos ni nada pesado: responde "OK" al instante.
    @GetMapping("/healthcheck")
    public String healthcheck() {
        return "OK";
    }
}