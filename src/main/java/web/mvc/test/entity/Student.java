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
public class Student implements SuperEntity {
    @Id
    private int id;
    private String name;
}
