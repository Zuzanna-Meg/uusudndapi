package com668.uusudnd.api.uusudndapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    @GetMapping("/status")
    public String index() {
        return "Status: online";
    }
}
