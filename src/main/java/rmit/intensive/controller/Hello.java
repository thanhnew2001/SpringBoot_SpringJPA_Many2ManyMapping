package rmit.intensive.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello wolrd";
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index(){
        return "Home page";
    }
}
