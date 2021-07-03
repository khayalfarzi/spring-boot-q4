package az.company.springbootq4.design_patterns.dto;

import az.company.springbootq4.model.constant.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonDTO {
    private String name;
    private String surname;
    private int age;
    private Gender gender;
    private String fatherName;
    private String motherName;
}
