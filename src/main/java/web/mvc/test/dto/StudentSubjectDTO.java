package web.mvc.test.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentSubjectDTO {
    private String studentId;
    private String subjectId;
    private int mark;
}
