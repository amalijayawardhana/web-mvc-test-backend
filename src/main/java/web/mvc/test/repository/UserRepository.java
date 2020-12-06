package web.mvc.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.mvc.test.entity.Student;
import web.mvc.test.entity.User;

public interface UserRepository extends JpaRepository<User,String> {
    User findByUsername(String username);

}
