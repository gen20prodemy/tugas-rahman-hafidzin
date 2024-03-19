//package com.prosigmaka.service;
//import com.prosigmaka.PersonRepository;
//import com.prosigmaka.controller.PersonController;
//import com.prosigmaka.model.PersonModel;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//
//public class PersonService{
//
//    PersonController pc = new PersonController();
//    record NewPersonRequest(
//            String name,
//            String email,
//            Integer age,
//            String test
//    ){}
//
//    public void addPerson(@RequestBody() PersonService.NewPersonRequest request){
//        PersonModel person = new PersonModel();
//        person.setName(request.name);
//        person.setAge(request.age);
//        person.setEmail(request.email);
//        person.setTest(request.test);
//    }
//}
