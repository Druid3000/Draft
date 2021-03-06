package app.service;

import app.exception.ResourceNotFoundException;
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

    public Person findById(Integer id){
        return personRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Person not found"));
    }

    @Transactional
    public void setPersonNameByPersonId(String secondName, Integer id){
        personRepository.setPersonNameByPersonId(secondName, id);
    }

    @Transactional
    public void deleteById(Integer id){
        personRepository.deleteById(id);
    }
}
