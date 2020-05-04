package app.repository;

import app.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

    @Modifying
    @Query(value = "update Person p set p.secondName = ?1 where p.personId = ?2")
    //TODO It does not update secondName. See JMP2019 project for use it as an example
    void setPersonNameByPersonId(String secondName, Integer personId);
}
