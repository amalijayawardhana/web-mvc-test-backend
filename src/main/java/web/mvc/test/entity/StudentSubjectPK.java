package web.mvc.test.entity;

import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class StudentSubjectPK implements Serializable {

    private int studentId;
    private int subjectId;

}
