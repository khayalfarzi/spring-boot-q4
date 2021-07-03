package az.company.springbootq4.design_patterns.dao.service.impl;

import az.company.springbootq4.design_patterns.dao.repository.HelloDAORepository;
import az.company.springbootq4.design_patterns.dao.service.HelloDAOService;
import az.company.springbootq4.design_patterns.dto.PersonDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HelloDAOServiceImpl implements HelloDAOService {

    private final HelloDAORepository repository;

    public HelloDAOServiceImpl(HelloDAORepository repository) {
        this.repository = repository;
    }

    public List<PersonDTO> get() {

        return repository.get()
                .stream()
                .map(person ->
                        PersonDTO.builder()
                                .fatherName(person.getFatherName())
                                .name(person.getName())
                                .gender(person.getGender())
                                .motherName(person.getMotherName())
                                .surname(person.getSurname())
                                .age(person.getAge())
                                .build()
                )
                .collect(Collectors.toList());
    }
}
