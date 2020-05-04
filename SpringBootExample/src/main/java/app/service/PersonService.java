package app.service;

import app.model.Person;
import app.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

@Controller
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    @Transactional
    public Person add(Person person){
        return personRepository.save(person);
    }

    @Transactional
    public Person findById(Integer id){
        //TODO add custom exception
        return personRepository.findById(id).orElse(new Person());
    }

    @Transactional
    public void updateById(Person person, Integer id){
        //TODO make it like JMP2019
        personRepository.updateById(person, id);
    }

    @Transactional
    public void deleteById(Integer id){
        personRepository.deleteById(id);
    }
}
