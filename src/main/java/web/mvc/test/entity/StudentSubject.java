package web.mvc.test.entity;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class StudentSubject implements SuperEntity {

    @EmbeddedId
    private StudentSubjectPK studentSubjectPK;
    private int mark;
    @ManyToOne
    @JoinColumn(name = "studentId", referencedColumnName = "id", insertable = false, updatable = false)
    private Student student;
    @ManyToOne
    @JoinColumn(name = "subjectId", referencedColumnName = "id", insertable = false, updatable = false)
    private Subject subject;

    public StudentSubject(StudentSubjectPK studentSubjectPK, int mark, Student student, Subject subject) {
        this.studentSubjectPK = studentSubjectPK;
        this.mark = mark;
        this.student = student;
        this.subject = subject;
    }

    public StudentSubject(int studentId, int subjectId, int mark) {
        this.studentSubjectPK = new StudentSubjectPK(studentId, subjectId);
        this.mark = mark;
    }

}
