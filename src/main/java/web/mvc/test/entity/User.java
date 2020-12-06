package web.mvc.test.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User implements SuperEntity {
    @Id
    private String username;
    private String password;
    private String role;
}
