package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class myController {
//    add a myName method
    public String sayHello(){
        System.out.println("Hello World");
        return "Hi Folks";
    }
}
