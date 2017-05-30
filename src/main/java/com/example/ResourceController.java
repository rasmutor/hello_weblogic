package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rasmutor on 5/11/17.
 */
@RestController
@RequestMapping("/resource")
public class ResourceController {

    @GetMapping
    public String readResource() {
        return "Hello!";
    }
}
