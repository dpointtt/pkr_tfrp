package ua.com.dpointtt.pkr_tfrp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.dpointtt.pkr_tfrp.entity.AUser;
import ua.com.dpointtt.pkr_tfrp.service.AUserService;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class AUserController {

    private final AUserService userService;

    @GetMapping
    public Flux<AUser> getUsers() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public Mono<AUser> getUser(@PathVariable int id) {
        return userService.getById(id);
    }

}
