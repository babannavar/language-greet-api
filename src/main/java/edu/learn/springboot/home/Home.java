package edu.learn.springboot.home;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

@RequestMapping("/home")
public String getMessage(){
    return "Ellarigau Namaskar";
}
}
