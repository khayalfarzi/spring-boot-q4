package az.company.springbootq4.design_patterns.dao.repository;

import az.company.springbootq4.design_patterns.dao.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HelloDAORepository {

    List<Person> get();
}
