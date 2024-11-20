package ua.com.dpointtt.pkr_tfrp.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.dpointtt.pkr_tfrp.entity.Appointment;
import ua.com.dpointtt.pkr_tfrp.entity.AppointmentType;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AppointmentService {

    private final List<Appointment> appointments = List.of(
            new Appointment(1L, "APPOINTMENT 1", "description", "clinic location", AppointmentType.MEDICINE, LocalDateTime.now(), 1L, 1L, null, null, null)
    );

    public Mono<Appointment> getById(int id) {
        return Mono.just(appointments.get(id));
    }

    public Flux<Appointment> getAll(){
        return Flux.fromIterable(appointments);
    }

}
