package br.com.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.apirest.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
