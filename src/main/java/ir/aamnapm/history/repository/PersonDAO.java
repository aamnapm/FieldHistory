package ir.aamnapm.history.repository;

import ir.aamnapm.history.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PersonDAO extends JpaRepository<Person, Long>, JpaSpecificationExecutor<Person> {
}
