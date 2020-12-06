package web.mvc.test.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.mvc.test.business.custom.StudentBO;
import web.mvc.test.business.custom.StudentSubjectBO;
import web.mvc.test.business.custom.SubjectBO;
import web.mvc.test.dto.StudentSubjectDTO;

import java.util.List;

@RestController
@RequestMapping("/api/v1/data")
public class StudentSubjectController {
    @Autowired
    private StudentBO studentBO;
    @Autowired
    private StudentSubjectBO studentSubjectBO;
    @Autowired
    private SubjectBO subjectBO;

    @GetMapping
    public List<StudentSubjectDTO> getAllData()  {
        return studentSubjectBO.getAllData();
    }
}
