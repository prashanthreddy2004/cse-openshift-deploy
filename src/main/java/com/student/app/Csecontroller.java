package com.student.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Csecontroller {
     @GetMapping("/home")
     public String disp() {
    	 return "WELLCOME TO GURU";
     }
}
