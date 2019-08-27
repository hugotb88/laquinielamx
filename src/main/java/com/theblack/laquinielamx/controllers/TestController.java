package com.theblack.laquinielamx.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Victor Hugo Olvera Cruz
 * Test Controller
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test (){
        return "Hello Bitches";
    }

}