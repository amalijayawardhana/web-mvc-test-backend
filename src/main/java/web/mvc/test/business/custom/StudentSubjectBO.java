package web.mvc.test.business.custom;

import web.mvc.test.business.SuperBO;
import web.mvc.test.dto.StudentSubjectDTO;

import java.util.List;

public interface StudentSubjectBO extends SuperBO {
    List<StudentSubjectDTO> getAllData() ;
}
