package ua.com.dpointtt.pkr_tfrp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class MainController {

    @GetMapping
    public Mono<String> index() {
        return Mono.just("Clinic Rest API! Будь ласка візміть мене, як до керівника диплому :)");
    }

}
