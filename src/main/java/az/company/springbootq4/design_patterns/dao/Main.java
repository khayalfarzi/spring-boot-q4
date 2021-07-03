package az.company.springbootq4.design_patterns.dao;

import az.company.springbootq4.design_patterns.dao.controller.HelloDAOController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Main {

    @Autowired
    static HelloDAOController controller;

    public static void main(String[] args) {
        controller.get();
    }
}
