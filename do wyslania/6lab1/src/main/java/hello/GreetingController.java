package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private static final String greeting = "Hello, %s!";
    private static final String aged = "I must say that you are %s";
    private static final String bye = "Goodbye, %s! I must say you are %s";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting") // odpowiada endpoint’om http
    public Greeting greeting(@RequestParam(value = "age", defaultValue = "old") String age,
                             @RequestParam(value = "name", defaultValue = "World") String name) {

        if(name.charAt(name.length() - 1) == 'a'){
            return new Greeting(counter.incrementAndGet(), String.format(aged, age), String.format(greeting, name), "Woman");
        }else{
            return new Greeting(counter.incrementAndGet(), String.format(aged, age), String.format(greeting, name), "Man");
        }

    }

    @RequestMapping("/byee") // odpowiada endpoint’om http
    public Greeting bye(@RequestParam(value = "age", defaultValue = "old") String age,
                             @RequestParam(value = "name", defaultValue = "World") String name) {

        if(name.charAt(name.length() - 1) == 'a'){
            return new Greeting(counter.incrementAndGet(), String.format(aged, age), String.format(bye, name), "Woman");
        }else{
            return new Greeting(counter.incrementAndGet(), String.format(aged, age), String.format(bye, name), "Man");
        }
    }
}