package com.example.demo;

 

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

 

@RestController
public class UserController {
@GetMapping("/user")
public void get() {
System.out.println("test");
}
@PostMapping
private String post() {
return "posted";
}

 

}