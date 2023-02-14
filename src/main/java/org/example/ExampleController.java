package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@SuppressWarnings("unused")
public class ExampleController {

    @GetMapping
    public String hello() {
        return "Hello World";
    }
}
