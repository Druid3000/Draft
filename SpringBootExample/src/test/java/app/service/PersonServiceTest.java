package app.service;

import app.model.Person;
import app.repository.PersonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class PersonServiceTest {

    private PersonService personService;

    @Mock
    private PersonRepository accountRepository;
    @Mock
    private Person person;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        personService = new PersonService(accountRepository);
    }

    @Test
    void createAccount() {
        when(accountRepository.save(person)).thenReturn(person);
        Person actualAccount = personService.add(person);
        verify(accountRepository, times(1)).save(person);
        Assertions.assertEquals(person, actualAccount);
    }
}
