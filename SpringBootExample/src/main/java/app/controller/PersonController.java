package app.controller;

import app.dto.PersonDto;
import app.dto.PersonResponseDto;
import app.model.Person;
import app.service.PersonService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/add")
    public ResponseEntity add(@RequestBody PersonDto personDto) {
        val newPerson = Person.builder()
                .firstName(personDto.getFirstName())
                .secondName(personDto.getSecondName())
                .age(personDto.getAge())
                .build();

        val person = personService.add(newPerson);

        val personResponseDto = PersonResponseDto.builder()
                .secondName(person.getSecondName())
                .build();

        return ResponseEntity.status(HttpStatus.CREATED).body(personResponseDto);
    }

    @GetMapping(value = "findById/{id}")
    public ResponseEntity<PersonDto> findById(@PathVariable Integer id){
        Person person = personService.findById(id);

        PersonDto personDto = PersonDto.builder()
                .personId(person.getPersonId())
                .firstName(person.getFirstName())
                .secondName(person.getSecondName())
                .age(person.getAge())
                .build();

        return new ResponseEntity<>(personDto, HttpStatus.OK);
    }

    @PostMapping("update")
    public ResponseEntity update(@RequestBody PersonDto personDto){
        val person = Person.builder()
                .personId(personDto.getPersonId())
                .firstName(personDto.getFirstName())
                .secondName(personDto.getSecondName())
                .age(personDto.getAge())
                .build();

        personService.updateById(person, person.getPersonId());

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("delete")
    public ResponseEntity delete(@RequestBody PersonDto personDto){
        val person = Person.builder()
                .personId(personDto.getPersonId())
                .build();

        personService.deleteById(person.getPersonId());

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
