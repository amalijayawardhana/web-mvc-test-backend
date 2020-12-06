package web.mvc.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.mvc.test.entity.StudentSubject;

public interface StudentSubjectRepository extends JpaRepository<StudentSubject, String> {


}
