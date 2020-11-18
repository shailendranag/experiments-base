package com.nag.springboothelloworld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restcontroller {
    @GetMapping("/")
    public String greeting(){
    return "Hello world Security";
}

    @GetMapping("/admin")
    public String admin(){ return "Hello World from Admin";}

    @GetMapping("/user")
    public String user(){ return "Hello World from USER";}

}
