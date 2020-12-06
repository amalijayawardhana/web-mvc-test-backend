package web.mvc.test.api;

import web.mvc.test.business.custom.StudentBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    @Autowired
    private StudentBO studentBO;
/*
    @GetMapping
    public List<StudentDTO> getAllStudents()  {
        return studentBO.getAllStudents();
    }*/


}
