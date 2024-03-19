package com.prosigmaka.controller;
import com.prosigmaka.controller.PersonController;
import com.prosigmaka.PersonRepository;
import com.prosigmaka.model.PersonModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/person")
public class PersonController {


    private PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    public PersonController() {
    }

    @GetMapping
    public List<PersonModel> getPerson(){
        return personRepository.findAll();
    }

    //dto, class baru, pilot(newpersonreq), entity
    record NewPersonRequest(
            String name,
            String email,
            Integer age,
            String test
    ){}

    @PostMapping
    public void postPerson(@RequestBody() NewPersonRequest request){
        PersonModel person = new PersonModel();
        person.setName(request.name);
        person.setAge(request.age);
        person.setEmail(request.email);
        person.setTest(request.test);
        personRepository.save(person);
    }

    @DeleteMapping("{personId}")
    public void deletePerson(@PathVariable("personId") Integer id){
        personRepository.deleteById(id);
    }

}
