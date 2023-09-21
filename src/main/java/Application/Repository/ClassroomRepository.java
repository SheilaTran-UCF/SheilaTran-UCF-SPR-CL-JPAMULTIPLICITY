package Application.Repository;
import java.util.List;
import Application.Model.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JPA Repository interface for the Classroom entity
 */
public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
    public Classroom save(Classroom classroom);
    public List<Classroom> findAll();
}
