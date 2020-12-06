package web.mvc.test.business.custom.impl;

import web.mvc.test.business.custom.StudentSubjectBO;
import web.mvc.test.dto.StudentSubjectDTO;
import web.mvc.test.entity.StudentSubject;
import web.mvc.test.repository.StudentRepository;
import web.mvc.test.repository.SubjectRepository;
import web.mvc.test.repository.StudentSubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Component
public class StudentSubjectBOImpl implements StudentSubjectBO {

    @Autowired
    private StudentSubjectRepository studentSubjectRepository;

//    @Transactional(readOnly = true)
    public List<StudentSubjectDTO> getAllData()  {
        List<StudentSubject> allData = studentSubjectRepository.findAll();

        List<StudentSubjectDTO> data = new ArrayList<>();


        for (StudentSubject data1 : allData) {
            data.add(new StudentSubjectDTO(data1.getStudent().getName(), data1.getSubject().getName(), data1.getMark()));
        }
        return data;
    }



}
