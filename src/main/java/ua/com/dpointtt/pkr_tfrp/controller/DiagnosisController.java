package ua.com.dpointtt.pkr_tfrp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.dpointtt.pkr_tfrp.entity.Diagnosis;
import ua.com.dpointtt.pkr_tfrp.service.DiagnosisService;

@RestController
@RequestMapping("/diagnoses")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class DiagnosisController {

    private final DiagnosisService diagnosisService;

    @GetMapping
    public Flux<Diagnosis> getDiagnoses() {
        return diagnosisService.getAll();
    }

    @GetMapping("/{id}")
    public Mono<Diagnosis> getDiagnosisById(@PathVariable int id) {
        return diagnosisService.getById(id);
    }
}
