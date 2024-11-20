package ua.com.dpointtt.pkr_tfrp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.com.dpointtt.pkr_tfrp.entity.Appointment;
import ua.com.dpointtt.pkr_tfrp.service.AppointmentService;

@RestController
@RequestMapping("/appointments")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class AppointmentController {

    private final AppointmentService appointmentService;

    @GetMapping
    public Flux<Appointment> getAppointments() {
        return appointmentService.getAll();
    }

    @GetMapping("/{id}")
    public Mono<Appointment> getAppointment(@PathVariable int id) {
        return appointmentService.getById(id);
    }
}
