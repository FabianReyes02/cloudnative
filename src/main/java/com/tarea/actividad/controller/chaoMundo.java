package com.tarea.actividad.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class chaoMundo {
    @GetMapping("/despedida")
    public static String chao() {
        return "Chao Mundo";
    }
}
