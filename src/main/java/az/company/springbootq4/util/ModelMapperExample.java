package az.company.springbootq4.util;

import az.company.springbootq4.model.Person;
import az.company.springbootq4.model.constant.Gender;
import org.modelmapper.ModelMapper;

public class ModelMapperExample {

    public void generateJson() {
        Person person = getPersonObject();
        ModelMapper mapper = new ModelMapper();
//        mapper.getConfiguration().addValueReader(person);
    }

    public Person getPersonObject() {
        return Person.builder()
                .age(11)
                .name("Name")
                .surname("Surname")
                .id(1)
                .gender(Gender.MALE)
                .fatherName("Father Name")
                .motherName("Mother Name")
                .build();
    }
}
