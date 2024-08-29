package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, String> getHomeDetails() {
        // Créer une map pour stocker les détails à retourner
        Map<String, String> response = new HashMap<>();

        // Ajouter les informations
        response.put("name", "Votre nom");
        response.put("email", "votreMail@campus-eni.fr");
        response.put("Date", LocalDate.now().toString());

        // Retourner la map sous forme de JSON
        return response;
    }
}
