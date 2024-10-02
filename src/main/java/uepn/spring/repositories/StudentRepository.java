package uepn.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uepn.spring.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
