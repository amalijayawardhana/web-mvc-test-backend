package web.mvc.test.business.custom.impl;

import web.mvc.test.business.custom.StudentBO;
import web.mvc.test.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
@Transactional
public class StudentBOImpl implements StudentBO {

    @Autowired
    private StudentRepository studentRepository;


}
