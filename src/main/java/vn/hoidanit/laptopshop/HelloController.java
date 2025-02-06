package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Hello World from Spring Boot! form udemy, aaaa update";
    }

    @GetMapping("/user")
    public String userPage() {
        return "User Page";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "Admin Page";
    }
}
