package az.company.springbootq4.design_patterns.dao.repository.impl;

import az.company.springbootq4.design_patterns.dao.model.Person;
import az.company.springbootq4.design_patterns.dao.repository.HelloDAORepository;
import az.company.springbootq4.model.constant.Gender;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class HelloDAORepositoryImpl implements HelloDAORepository {

    @Override
    public List<Person> get() {
        return Arrays.asList(
                Person.builder()
                        .age(11)
                        .fatherName("FN1")
                        .name("N1")
                        .motherName("MN1")
                        .id(1)
                        .gender(Gender.MALE)
                        .surname("SN1")
                        .build(),
                Person.builder()
                        .age(12)
                        .fatherName("FN2")
                        .name("N2")
                        .motherName("MN2")
                        .id(2)
                        .gender(Gender.MALE)
                        .surname("SN2")
                        .build(),
                Person.builder()
                        .age(33)
                        .fatherName("FN3")
                        .name("N3")
                        .motherName("MN3")
                        .id(3)
                        .gender(Gender.FEMALE)
                        .surname("SN3")
                        .build(),
                Person.builder()
                        .age(44)
                        .fatherName("FN4")
                        .name("N4")
                        .motherName("MN4")
                        .id(4)
                        .gender(Gender.FEMALE)
                        .surname("SN4")
                        .build(),
                Person.builder()
                        .age(55)
                        .fatherName("FN5")
                        .name("N5")
                        .motherName("MN5")
                        .id(5)
                        .gender(Gender.FEMALE)
                        .surname("SN5")
                        .build(),
                Person.builder()
                        .age(66)
                        .fatherName("FN6")
                        .name("N1")
                        .motherName("MN1")
                        .id(1)
                        .gender(Gender.MALE)
                        .surname("SN6")
                        .build());
    }
}