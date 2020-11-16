package com.nag.springboothelloworld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restcontroller {
    @GetMapping("/greeting")
    public String greeting(){
    return "Hello world Security";
}

}
