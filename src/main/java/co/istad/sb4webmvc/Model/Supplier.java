package co.istad.sb4webmvc.Model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Supplier {
    private Integer id;
    private String company;
    private LocalDate since;
    private Boolean status;
}
