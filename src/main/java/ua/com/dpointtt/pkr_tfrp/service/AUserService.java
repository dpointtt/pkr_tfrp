package ua.com.dpointtt.pkr_tfrp.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.dpointtt.pkr_tfrp.entity.AUser;
import ua.com.dpointtt.pkr_tfrp.entity.Role;

import java.util.List;

@Service
public class AUserService {

    private final List<AUser> users = List.of(
            new AUser(1L, "Doctor", "Doctor", "doctor_password", Role.DOCTOR),
            new AUser(2L, "Nurse", "Nurse", "nurse_password", Role.NURSE),
            new AUser(3L, "Patient", "Patient", "patient_password", Role.PATIENT)
    );


    public Mono<AUser> getById(int id) {
        return Mono.just(users.get(id));
    }

    public Flux<AUser> getAll(){
        return Flux.fromIterable(users);
    }
}
