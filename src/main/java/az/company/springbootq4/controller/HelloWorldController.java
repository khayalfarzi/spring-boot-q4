package az.company.springbootq4.controller;

import az.company.springbootq4.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping("/get") // http://localhost:8080/hello/get
    public String get() {
        return "Hello Spring web get method";
    }

    @PostMapping("/user") // http://localhost:8080/hello/user
    public void get(@RequestBody User user) {
        System.out.println("get user method: " + user);
    }

    @PostMapping("/post") // http://localhost:8080/hello/post?element=hello
    public void post(@RequestParam("element") String element) {
        System.out.println("From post method: " + element);
    }

    @PatchMapping("/patch") // http://localhost:8080/hello/patch?element=hello
    public void update(@RequestParam("element") String element) {
        System.out.println("From update method: " + element);
    }

    @DeleteMapping("/delete/{element}")  // http://localhost:8080/hello/delete/hello
    public void delete(@PathVariable("element") String element) {
        System.out.println("Delete method running..." + element);
    }
}