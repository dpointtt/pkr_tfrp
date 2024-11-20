package ua.com.dpointtt.pkr_tfrp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Appointment {
    private Long id;
    private String title;
    private String description;
    private String location;
    private AppointmentType type;
    private LocalDateTime dateAssigned;
    private Long assignedBy;
    private Long diagnosisId;
    private Boolean done;
    private LocalDateTime dateDone;
    private String doneBy;
}
