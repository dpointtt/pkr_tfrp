package ua.com.dpointtt.pkr_tfrp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AUser {
    private Long id;
    private String firstName;
    private String lastName;
    private String password;
    private Role role;
}
