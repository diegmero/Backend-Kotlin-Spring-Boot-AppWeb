package com.example.miWeb.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ApiController {

    @GetMapping("/api/hello")
    fun hello(): Map<String, String> {
        return mapOf("message" to "Estamos conectados con la API!")
    }
}