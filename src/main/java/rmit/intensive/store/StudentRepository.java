package rmit.intensive.store;

import org.springframework.data.jpa.repository.JpaRepository;
import rmit.intensive.model.Student;


public interface StudentRepository extends JpaRepository<Student, Integer> {
}
