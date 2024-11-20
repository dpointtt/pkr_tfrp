package ua.com.dpointtt.pkr_tfrp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Diagnosis {
    private Long id;
    private String description;
    private String overallStatus;
    private Long patientId;
}
