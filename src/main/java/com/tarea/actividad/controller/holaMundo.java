package com.tarea.actividad.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class holaMundo {
    @GetMapping("/")
    public static String saludos() {
        return "Hola Mundo";
    }
}
