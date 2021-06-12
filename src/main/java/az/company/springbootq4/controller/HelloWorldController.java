package az.company.springbootq4.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping("/get") // http://localhost:8080/hello/get
    public String get() {
        return "Hello Spring web get method";
    }

    @PostMapping("/post") // http://localhost:8080/hello/post?element=hello
    public void post(@RequestParam("element") String element) {
        System.out.println("From post method: " + element);
    }

    @PatchMapping("/patch") // http://localhost:8080/hello/patch?element=hello
    public void update(@RequestParam("element")String element) {
        System.out.println("From update method: " + element);
    }

    @DeleteMapping("/delete")  // http://localhost:8080/hello/delete
    public void delete() {
        System.out.println("Delete method running...");
    }
}