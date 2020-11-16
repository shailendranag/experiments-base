package com.nag.springboothelloworld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restcontroller {
    @GetMapping("/")
    public String greeting(){
    return "Hello world Security";
}

}
