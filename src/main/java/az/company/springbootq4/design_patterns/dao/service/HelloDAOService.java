package az.company.springbootq4.design_patterns.dao.service;

import az.company.springbootq4.design_patterns.dao.model.Person;
import az.company.springbootq4.design_patterns.dto.PersonDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HelloDAOService {

    List<PersonDTO> get();
}