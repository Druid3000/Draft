package app.repository;

import app.model.Person;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

    @Modifying
    @Query(value = "update Person p set p = ?1 where p.personId = ?2")
    void updateById(Person person, Integer id);
}
