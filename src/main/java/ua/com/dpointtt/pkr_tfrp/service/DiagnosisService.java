package ua.com.dpointtt.pkr_tfrp.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.dpointtt.pkr_tfrp.entity.Diagnosis;

import java.util.List;

@Service
public class DiagnosisService {

    private final List<Diagnosis> diagnoses = List.of(
            new Diagnosis(1L, "diagnosis_description", "patient status", 3L)
    );

    public Mono<Diagnosis> getById(int id) {
        return Mono.just(diagnoses.get(id));
    }

    public Flux<Diagnosis> getAll(){
        return Flux.fromIterable(diagnoses);
    }
}
