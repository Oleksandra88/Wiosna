package pl.teb.edukacja.wiosna;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class GreetingController {
    private static final String template = "Hello , %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")

    public String greeting (Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }
}




