package az.company.springbootq4.design_patterns.bean_definition_dp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String name;
    private String surname;
    private int age;
}
