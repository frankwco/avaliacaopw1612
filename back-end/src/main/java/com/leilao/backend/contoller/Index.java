package com.leilao.backend.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {


    @GetMapping("/index")
    public String index() {
        return "Teste";
    }
}
