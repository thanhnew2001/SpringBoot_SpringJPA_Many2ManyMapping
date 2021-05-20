package rmit.intensive.store;

import org.springframework.data.jpa.repository.JpaRepository;
import rmit.intensive.model.Admission;

public interface AdmissionRepository extends JpaRepository<Admission, Integer> {
}
