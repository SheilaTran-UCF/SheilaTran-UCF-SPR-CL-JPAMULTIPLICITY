package Application.Repository;
import Application.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * JPA Repository interface for the Student entity
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
    public Student save(Student student);
    public List<Student> findAll();

    public Optional<Student> findById(long studentId);
}

