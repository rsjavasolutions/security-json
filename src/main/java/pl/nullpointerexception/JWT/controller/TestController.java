package pl.nullpointerexception.JWT.controller;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableWebSecurity
public class TestController {

    @GetMapping("/tests")
    public String test(){
        return "siema to security test";
    }
}
