//package az.company.springbootq4.util;
//
//import az.company.springbootq4.model.Person;
//import az.company.springbootq4.model.constant.Gender;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//
//@Component
//public class ObjectMapperExample {
//
//
//    //    Generated Person object: Person{id=1, name='Name', surname='Surname', age=11, gender=MALE, fatherName='Father Name', motherName='Mother Name'}
//    @PostConstruct
//    public void generateObject() throws Exception {
//        String json = "{\"id\":1,\"name\":\"Name\",\"surname\":\"Surname\",\"age\":11,\"gender\":\"MALE\",\"fatherName\":\"Father Name\",\"motherName\":\"Mother Name\"}";
//        ObjectMapper mapper = new ObjectMapper();
//        Person person = mapper.readValue(json, Person.class);
//
//        //Generated : {"id":1,"name":"Name","surname":"Surname","age":11,"gender":"MALE","fatherName":"Father Name","motherName":"Mother Name"}
//        public void generateJson () throws Exception {
//            Person person = getPersonObject();
//            ObjectMapper mapper = new ObjectMapper();
//            String json = mapper.writeValueAsString(person);
//            System.out.printf("Generated json value : %s", json);
//        }
//        System.out.printf("Generated Person object: %s", person);
//    }
//
//    public Person getPersonObject() {
//        Person person = new Person();
//        person.setAge(11);
//        person.setGender(Gender.MALE);
//        person.setFatherName("Father Name");
//        person.setId(1);
//        person.setName("Name");
//        person.setMotherName("Mother Name");
//        person.setSurname("Surname");
//        return person;
//    }
//}