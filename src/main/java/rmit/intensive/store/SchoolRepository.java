package rmit.intensive.store;

import org.springframework.data.jpa.repository.JpaRepository;
import rmit.intensive.model.School;

public interface SchoolRepository extends JpaRepository<School, Integer> {
}
